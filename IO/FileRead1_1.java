import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileRead1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(args[0]);
            
            int b;
            // System.out.println(fis.available()+" bytes");
            while((b = fr.read()) != -1) {
                System.out.println((char)b);
                // System.out.println(fis.available()+" bytes");
            }
            fr.close();
        } catch(FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}