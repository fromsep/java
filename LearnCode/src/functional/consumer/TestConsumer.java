package functional.consumer;

import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        ConsumeString("abc", s -> System.out.println(s));
        ConsumeStr("abc", System.out::println, s -> System.out.println(new StringBuffer(s).reverse()));

        testPrint(str -> {
            String name = str.split(",")[0];
            System.out.println(name);
        }, str -> {
            String age = str.split(",")[1];
            System.out.println(age);
        });
    }

    private static void testPrint(Consumer<String> consumer1, Consumer<String> consumer2) {
        String[] strings = {"A,1", "B,2", "C,3"};
        for (String str : strings) {
            consumer1.andThen(consumer2).accept(str);
        }
    }

    private static void ConsumeStr(String str, Consumer<String> con1, Consumer<String> con2)  {
//        con1.accept(str);
//        con2.accept(str);
        con1.andThen(con2).accept(str);
    }

    private static void ConsumeString(String str, Consumer<String> consumer) {
        consumer.accept(str);
    }


}
