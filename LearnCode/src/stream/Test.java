package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
//         testFilter();

        // testSort();

        testSum();

    }

    private static void testSum() {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");

        int sum = strings.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }

    private static void testSort() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a1");
        strings.add("a2");
        strings.add("ccc");
        strings.add("bb");

        strings.stream().sorted((s1,s2) -> {
            return s1.length() - s2.length();
        }).forEach(System.out::println);
    }


    private static void testFilter() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);


        long count = integers.stream().filter(i -> i > 2).count();
        System.out.println(count);

        System.out.println("+++++++++++++++++++++");

        integers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
        System.out.println("+++++++++++++++++++++");

        integers.stream().filter(i -> i % 2 == 0).filter(i -> i % 3 == 0).forEach(System.out::println);
        System.out.println("+++++++++++++++++++++");

        integers.stream().skip(1).limit(2).forEach(System.out::println);
        System.out.println("+++++++++++++++++++++");


        Stream<Integer> s1 = integers.stream().skip(3);
        Stream<Integer> s2 = integers.stream().skip(2);

        Stream.concat(s1, s2).distinct().forEach(System.out::println);
        System.out.println("+++++++++++++++++++++");
    }



}
