package file;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // createFile();
        // deleteFile();

        listFiles();
    }

    private static void createFile() throws IOException {
        File file = new File("test.txt");
        file.createNewFile();
    }

    private static void deleteFile() {
        File file = new File("test.txt");
        boolean isDelete = file.delete();
        System.out.println(isDelete);
    }

    private static void listFiles() {
        File file = new File("./");
        File[] files = file.listFiles();
        for(File f:files) {
            System.out.println(f.getName());
        }
    }
}
