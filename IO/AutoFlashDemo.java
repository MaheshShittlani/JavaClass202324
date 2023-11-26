
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class AutoFlashDemo {
    public static void main(String[] args) {
        try {
            // PrintStream printStream = new PrintStream(new FileOutputStream("textfiles/autoflush.txt"), false);


            // printStream.print("Line1");
            // printStream.print("Line2");
            // printStream.flush();
            // printStream.close();

            PrintWriter printWriter = new PrintWriter(
                new FileWriter("textfiles/autoflush"), true);
            printWriter.println("Hello Print Writer");
            printWriter.print("This will not visible");
            
            

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
