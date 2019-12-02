package functional.consumer;

import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {

        String s = getString(() -> "sss");
        System.out.println(s);

        int num = getInteger(() -> 3);
        System.out.println(num);

        int[] arr = new int[] {5,3,6,7,2};

        int maxValue = getMax(()->{
            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        });

        System.out.println(maxValue);
    }

    private static int getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }

    private static Integer getInteger(Supplier<Integer> supplier) {
        return supplier.get();
    }

    private static String getString(Supplier<String> supplier) {
        return supplier.get();
    }


}
