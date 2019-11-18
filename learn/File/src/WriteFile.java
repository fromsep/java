import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteFile {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"))) {
            writer.write("测试\n");
            writer.write("1\n");
            writer.write("2\n");
            writer.write(new SimpleDateFormat("yyyyMMdd").format(new Date()));
            // writer.flush();
            writer.close();
            System.out.println("写入完成");
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
