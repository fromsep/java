import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        StringBuffer content = new StringBuffer();
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                content.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("文件内容读取完毕");
        System.out.println(content.toString());
    }
}
