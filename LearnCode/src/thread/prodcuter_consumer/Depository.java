package thread.prodcuter_consumer;

public class Depository {
    private int productAmount = 0;

    public synchronized void increase(int amount) {
        this.productAmount += amount;
    }

    public synchronized void decrease(int amount) {
        this.productAmount -= amount;
    }

}
