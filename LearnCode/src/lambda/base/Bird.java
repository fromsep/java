package lambda.base;

public class Bird implements ISay {
    @Override
    public void say(String str) {
        System.out.println(str);
    }
}
