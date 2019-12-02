package functional.predicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        String str = "hello";

        boolean res = testLength(str, s -> s.length() >= 5);
        System.out.println(res);

        res =  testAnd(str, s -> s.length() >= 5, s -> s.length() > 5);
        System.out.println(res);


        int[] ints = {1, 2, 3, 4, 5, 6};

        ArrayList<Integer> resNums = testFilter(ints, i -> i % 2 == 0, i -> i % 3 == 0);
        System.out.println(resNums);

    }

    private static boolean testAnd(String str, Predicate<String> predicate1, Predicate<String> predicate2) {
        return predicate1.and(predicate2).test(str);
    }

    private static boolean testLength(String s, Predicate<String> predicate) {
        return predicate.negate().test(s);
    }

    private static ArrayList<Integer> testFilter(int[] nums, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        ArrayList<Integer> res = new ArrayList<Integer>();

        for (Integer num:nums) {
            if(predicate1.and(predicate2).test(num)) {
                res.add(num);
            }
        }

        return res;
    }

}
