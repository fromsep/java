package thread.base;

public class Main {
    public static void main(String[] args) {
        testThread();
        // testRunnable();
    }

    private static void testThread() {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");

        a.start();
        b.start();
    }

    private static void testRunnable() {
        MyRunnable myRunnable = new MyRunnable();

        Thread a = new Thread(myRunnable, "A");
        Thread b = new Thread(myRunnable, "B");

        a.start();
        b.start();
    }
}
