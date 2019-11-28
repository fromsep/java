package thread.prodcuter_consumer;

public class Main {
    public static void main(String[] args) {
        Depository depository = new Depository();

        for (int i = 0; i < 100; i++) {
            Producter producter = new Producter("P-" + i, depository);
            Consumer consumer = new Consumer( "C-" + i, depository);

            producter.start();
            consumer.start();
        }

        System.out.println("仓库剩余产品" + depository.getProductAmount());
    }
}
