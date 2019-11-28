package thread.order_lock;


import java.util.concurrent.locks.ReentrantLock;

public class Sale implements Runnable {
    private int productAmount = 100;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            lock.lock();
            if(this.productAmount > 0) {
                System.out.printf("[%s]售出第%d\t件商品\n", Thread.currentThread().getName(), this.productAmount);
                this.productAmount--;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
