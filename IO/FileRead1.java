// InputStream(A) => FileInputSteam(C)
// ------------------------------------

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileRead1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            
            int b;
            // System.out.println(fis.available()+" bytes");
            while((b = fis.read()) != -1) {
                System.out.println((char)b);
                // System.out.println(fis.available()+" bytes");
            }
            fis.close();
        } catch(FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}