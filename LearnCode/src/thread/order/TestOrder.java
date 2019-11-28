package thread.order;

public class TestOrder {
    public static void main(String[] args) {
        Sale productSale = new Sale();

        for (int i = 0; i < 200; i++) {
            Thread thread1 = new Thread(productSale, "第1销售处");
            Thread thread2 = new Thread(productSale, "第2销售处");
            Thread thread3 = new Thread(productSale, "第3销售处");

            thread1.start();
            thread2.start();
            thread3.start();
        }
    }
}
