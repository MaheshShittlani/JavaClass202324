import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileCopy3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            FileOutputStream fos = new FileOutputStream(args[1], true);

            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            
            // BufferedInputStream bis = new BufferedInputStream(new FileInputStream(args[0]));

            // BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(args[1]));


            int length;
            byte[] buffer = new byte[1024];
            while((length = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, length);;
            }


            bis.close();
            bos.close();
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        

    }
}
