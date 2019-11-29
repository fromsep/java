package thread.producer_consumer;

class Depository {
    private int productAmount = 0;

    synchronized boolean increaseProduct(int amount) {
        this.productAmount += amount;
        notifyAll();
        return true;
    }

    synchronized int decreaseProduct(int amount) {
        int decreaseAmount = 0;
        if(this.productAmount == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("[%s]没产品了,等待中\n", Thread.currentThread().getName());
            return decreaseAmount;
        }

        if (this.productAmount >= amount) {
            this.productAmount -= amount;
            decreaseAmount = amount;
        } else {
            decreaseAmount = this.productAmount;
            this.productAmount = 0;
        }

        return decreaseAmount;
    }

    int getProductAmount() {
        return productAmount;
    }
}
