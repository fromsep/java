package thread.prodcuter_consumer;

class Consumer extends Thread {
    private Depository depository;

    Consumer(String name, Depository depository) {
        super(name);
        this.depository = depository;
    }

    @Override
    public void run() {
        int amount = 1;
        boolean result = this.depository.decreaseProduct(amount);
        if(result) {
            System.out.printf("[%s]消费了产品%d,剩余%d\n", this.getName(), amount,this.depository.getProductAmount());
        }
    }
}
