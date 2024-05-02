package Lesson_17;

public class WaitNotifyExample {

    private static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 1: Waiting...");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 1: Waked up!");
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2: Notifying...");
                lock.notify();
                System.out.println("Thread 2: Notified!");
            }
        });


        t1.join();
        t2.join();

        t1.start();
        t2.start();
    }
}
