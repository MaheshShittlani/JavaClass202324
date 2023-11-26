import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            byte[] buffer = new byte[1024];

            int length;
            while((length = fis.read(buffer)) != -1) {
                String s = new String(buffer, 0, length);
                System.out.println(s);
            }

            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException e) {
            System.out.println(e);
        }

    }
}
