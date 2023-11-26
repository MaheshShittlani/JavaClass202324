import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            byte[] buffer = new byte[1024];

            int length;
            while(true) {
                length = fis.read(buffer);
                if(length == -1) {
                    break;
                }
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
