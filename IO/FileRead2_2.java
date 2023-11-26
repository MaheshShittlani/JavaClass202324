import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileRead2_2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(args[0]);
            char[] buffer = new char[1024];

            int length;
            while((length = fr.read(buffer)) != -1) {
                String s = new String(buffer, 0, length);
                System.out.print(s);
            }

            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException e) {
            System.out.println(e);
        }

    }
}
