import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceIO {
    public static void main(String[] args) {
        try (
            FileInputStream fis1 = new FileInputStream("textfiles/a.txt");
            FileInputStream fis2 = new FileInputStream("textfiles/b.txt");
            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
            FileOutputStream fos = new FileOutputStream("textfiles/c.txt");
        ) {

            int data;

            while((data = sis.read()) != -1) {
                fos.write(data);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }
}
