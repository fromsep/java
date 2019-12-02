package functional.function;

import java.util.function.Function;

public class Test {

    public static void main(String[] args) {
        Integer number = 5;

        String s = int2string(number, String::valueOf);
        System.out.println(s);

        Integer integer = string2int(s, str -> Integer.parseInt(str) + 1000);
        System.out.println(integer);
        
        Integer convert = convert(number, String::valueOf, str -> Integer.parseInt(str) + 1000);
        System.out.println(convert);
    }

    private static Integer convert(Integer number, Function<Integer,String> func1, Function<String, Integer> func2) {
        return func1.andThen(func2).apply(number);
    }


    private static Integer string2int(String s, Function<String, Integer> func2) {
        return func2.apply(s);
    }

    private static String int2string(Integer number, Function<Integer, String> func) {
        return func.apply(number);
    }


}
