import java.io.File;
import java.io.IOException;

public class FileInfo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("../Notes-Array.txt");
        File f2 = new File("../Notes-Arrays.txt");

        System.out.println(f1.getName());
        System.out.println(f1.getParent());
        System.out.println(f1.getPath());

        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getCanonicalPath());

        f1.renameTo(f2);
    }
}
