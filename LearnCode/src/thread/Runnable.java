package thread;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName() + "-" + i);

            System.out.printf("%s-%d\n", Thread.currentThread().getName(), i);
        }
    }
}
