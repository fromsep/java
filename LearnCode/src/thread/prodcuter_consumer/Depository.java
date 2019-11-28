package thread.prodcuter_consumer;

class Depository {
    private int productAmount = 0;

    synchronized boolean increaseProduct(int amount) {
        this.productAmount += amount;
        return true;
    }

    synchronized boolean decreaseProduct(int amount) {
        if(this.productAmount == 0) {
            return false;
        }

        if (this.productAmount >= amount) {
            this.productAmount -= amount;
        } else {
            this.productAmount = 0;
        }

        return true;
    }

    int getProductAmount() {
        return productAmount;
    }
}
