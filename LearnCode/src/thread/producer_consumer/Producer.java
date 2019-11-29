package thread.producer_consumer;

class Producer extends Thread {
    private Depository depository;

    Producer(String name, Depository depository) {
        super(name);
        this.depository = depository;
    }

    @Override
    public void run() {
        int amount = (int)(Math.random() * 20);
        boolean result = this.depository.increaseProduct(amount);
        if(result) {
            System.out.printf("[%s]生产了产品%d, 剩余%d\n", this.getName(), amount, this.depository.getProductAmount());
        }
    }
}
