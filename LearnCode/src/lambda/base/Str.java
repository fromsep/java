package lambda.base;

public class Str implements IStr {
    @Override
    public String substr(String s, int x, int y) {
        return s.substring(x, y);
    }
}
