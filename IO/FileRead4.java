import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            byte[] buffer = new byte[1024];

            System.out.println(fis.available()+" bytes");
            int length;
            while(fis.available() > 0) {
                length = fis.read(buffer);
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
