package thread.producer_consumer;

class Consumer extends Thread {
    private Depository depository;

    Consumer(String name, Depository depository) {
        super(name);
        this.depository = depository;
    }

    @Override
    public void run() {
        int amount = 15;
        int decreaseAmount = this.depository.decreaseProduct(amount);
        System.out.printf("[%s]消费了产品%d,剩余%d\n", this.getName(), decreaseAmount,this.depository.getProductAmount());
    }
}
