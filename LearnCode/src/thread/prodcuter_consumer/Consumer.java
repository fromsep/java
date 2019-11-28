package thread.prodcuter_consumer;

public class Consumer extends Thread {
    private Depository depository;

    public Consumer(Depository depository) {
        this.depository = depository;
    }

    @Override
    public void run() {
        super.run();
    }
}
