package lambda.base;

public class Test {
    public static void main(String[] args) {

//        testSay(new Student());
//
//        testSay(()->{
//            System.out.println("我来自lambda");
//        });

//        testBirSay((String s) -> {
//            System.out.println("from lambda");
//            System.out.println(s);
//        });
        
//        testAdd((int x, int y) -> {
//            return x + y;
//        });

        // 省略模式
        testAdd((x, y) -> {
            return x + y;
        });

        testAdd(((x, y) -> x + y));

        testSay(() -> System.out.println("我来自lambda"));

        testBirdSay(s -> System.out.println(s));

        // 方法引用符
        testBirdSay(System.out::println);

        // 实例方法引用
        Bird bird = new Bird();
        testBirdSay(bird::say);

        //
        testSubStr(new Str());
        testSubStr(String::substring);

        // 引用构造器
        testStu(Stu::new);

    }

    private static void testAdd(IAdd add) {
        int result = add.add(1, 2);
        System.out.println(result);
    }

    private static void testBirdSay(ISay iSay) {
        String s = "我是一只鸟";
        iSay.say(s);
    }

    private static void testSay(Man man) {
        man.say();
    }

    private static void testSubStr(IStr str) {
        String s = "wcm5555";
        int x = 1;
        int y = 2;
        System.out.println(str.substr(s, x, y));
    }

    private static void testStu(IStuBuilder b) {
        Stu stu = b.build("小明", 12);
        System.out.println(stu.getName());
    }

}
