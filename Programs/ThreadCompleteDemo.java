
import java.util.*;

class WorkerThread extends Thread {

    WorkerThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println(
            getName() + " started"
        );

        for (int i = 1; i <= 3; i++) {

            System.out.println(
                getName() + " : " + i
            );

            try {
                Thread.sleep(300);
            }
            catch (InterruptedException e) {

                System.out.println(
                    getName() + " was interrupted"
                );

                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println(
            getName() + " completed"
        );
    }
}

public class ThreadCompleteDemo {

    public static void main(String[] args) {

        // 1. Creating a thread
        WorkerThread t1 = new WorkerThread("Worker-1");

        System.out.println("1. Thread Creation");

        System.out.println("Name: " + t1.getName());

        System.out.println("ID: " + t1.threadId());

        System.out.println("Priority: " + t1.getPriority());

        System.out.println("State: " + t1.getState());

        System.out.println("Alive: " + t1.isAlive());


        // 2. Setting thread properties
        System.out.println("\n2. Thread Properties");

        t1.setName("MyWorker");

        t1.setPriority(Thread.MAX_PRIORITY);

        System.out.println("New Name: " + t1.getName());

        System.out.println("New Priority: " + t1.getPriority());


        // 3. Current thread
        System.out.println("\n3. Current Thread");

        Thread current = Thread.currentThread();

        System.out.println("Current Name: " + current.getName());

        System.out.println("Current ID: " + current.threadId());

        System.out.println("Current Priority: " + current.getPriority());

        System.out.println("Current State: " + current.getState());


        // 4. Starting a thread
        System.out.println("\n4. Starting Thread");

        t1.start();

        System.out.println("Is Alive: " + t1.isAlive());

        System.out.println("State: " + t1.getState());


        // 5. Yield
        System.out.println("\n5. Yield Example");

        Thread.yield();

        System.out.println("Main thread continued");


        // 6. Join
        System.out.println("\n6. Join Example");

        try {
            t1.join();
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println("Worker finished");

        System.out.println("Is Alive: " + t1.isAlive());

        System.out.println("Final State: " + t1.getState());


        // 7. Interrupt example
        System.out.println("\n7. Interrupt Example");

        WorkerThread t2 = new WorkerThread("Worker-2");

        t2.start();

        try {
            Thread.sleep(400);

            t2.interrupt();

            t2.join();
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }


        // 8. Interrupted status methods
        System.out.println("\n8. Interrupt Status");

        Thread t3 = new Thread(() -> {

            while (!Thread.currentThread().isInterrupted()) {
                Thread.yield();
            }

            System.out.println("T3 detected interruption");
        });

        t3.start();

        t3.interrupt();

        try {
            t3.join();
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println("isInterrupted: " + t3.isInterrupted());


        // 9. Daemon thread
        System.out.println("\n9. Daemon Thread");

        Thread daemon = new Thread(() -> {

            while (true) {

                System.out.println("Daemon working");

                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }

        }, "DaemonWorker");

        daemon.setDaemon(true);

        System.out.println("Is Daemon: " + daemon.isDaemon());

        daemon.start();


        // 10. Thread group
        System.out.println("\n10. Thread Group");

        System.out.println(
            "Group: " + current.getThreadGroup().getName()
        );


        // 11. Active thread count
        System.out.println("\n11. Active Thread Count");

        System.out.println(
            "Active Threads: " + Thread.activeCount()
        );


        // 12. Thread enumeration
        System.out.println("\n12. Thread Enumeration");

        Thread[] threads = new Thread[Thread.activeCount() + 10];

        int count = Thread.enumerate(threads);

        for (int i = 0; i < count; i++) {

            System.out.println(
                threads[i].getName()
            );
        }


        // 13. Thread stack trace
        System.out.println("\n13. Stack Trace");

        StackTraceElement[] trace = current.getStackTrace();

        for (StackTraceElement element : trace) {
            System.out.println(element);
        }


        // 14. All thread stack traces
        System.out.println("\n14. All Thread Stack Traces");

        Map<Thread, StackTraceElement[]> allTraces =
                Thread.getAllStackTraces();

        System.out.println(
            "Number of threads: " + allTraces.size()
        );


        // 15. Check lock ownership
        System.out.println("\n15. Holds Lock");

        Object lock = new Object();

        synchronized (lock) {

            System.out.println(
                "Holds Lock: " + Thread.holdsLock(lock)
            );
        }

        System.out.println(
            "After synchronized: " + Thread.holdsLock(lock)
        );


        // 16. Dump stack
        System.out.println("\n16. Dump Stack");

        Thread.dumpStack();


        // 17. Interrupted() static method
        System.out.println("\n17. Interrupted Status");

        System.out.println(
            "Interrupted: " + Thread.interrupted()
        );


        System.out.println("\nProgram completed");
    }
}
