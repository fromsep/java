package thread.prodcuter_consumer;

public class Producter extends Thread {
    private Depository depository;

    public Producter(Depository depository) {
        this.depository = depository;
    }

    @Override
    public void run() {
        super.run();
    }
}
