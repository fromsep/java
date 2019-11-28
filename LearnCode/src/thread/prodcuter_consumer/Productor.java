package thread.prodcuter_consumer;

class Productor extends Thread {
    private Depository depository;

    Productor(String name, Depository depository) {
        super(name);
        this.depository = depository;
    }

    @Override
    public void run() {
        int amount = 10;
        boolean result = this.depository.increaseProduct(amount);
        if(result) {
            System.out.printf("[%s]生产了产品%d, 剩余%d\n", this.getName(), amount, this.depository.getProductAmount());
        }
    }
}
