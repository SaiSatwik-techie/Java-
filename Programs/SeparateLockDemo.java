
class Reserve implements Runnable {

    int available = 1;
    int wanted;

    // Separate lock object
    private final Object lock = new Object();

    Reserve(int wanted) {
        this.wanted = wanted;
    }

    public void run() {

        synchronized (lock) {

            System.out.println(
                "Available Berths = " + available
            );

            if (available >= wanted) {

                String name = Thread.currentThread().getName();

                System.out.println(
                    wanted + " berth reserved for " + name
                );

                try {
                    Thread.sleep(1500);
                }
                catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                available = available - wanted;

            } else {

                System.out.println("Sorry, no berths available");
            }
        }
    }
}

public class SeparateLockDemo {

    public static void main(String[] args) {

        Reserve obj = new Reserve(1);

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setName("First Person");
        t2.setName("Second Person");

        t1.start();
        t2.start();
    }
}
