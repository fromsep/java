import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        String filePath = "test.txt";
        File file = null;

        try {
            file = new File(filePath);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        if (file.exists() == false) {
            System.out.println("文件不存在");
            return;
        }

        if(file.delete() == true) {
            System.out.println("文件删除成功");
        } else {
            System.out.println("文件删除失败");
        }
    }
}
