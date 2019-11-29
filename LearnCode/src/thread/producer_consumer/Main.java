package thread.producer_consumer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Depository depository = new Depository();

        for (int i = 0; i < 10; i++) {
            Producer producer = new Producer("P-" + i, depository);
            producer.start();
            producer.join();

            Consumer consumer = new Consumer( "C-" + i, depository);
            consumer.start();
//            consumer.join();
        }

        System.out.println("仓库剩余产品" + depository.getProductAmount());
    }
}
