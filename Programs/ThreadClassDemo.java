
class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("Thread is running!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class ThreadClassDemo {

    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.start();

        System.out.println("Main Thread is running!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
        }
    }
}
