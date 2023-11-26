import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadAccount {
    public static void main(String[] args) {
        try 
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("textfiles/accounts.dat"));
            Account a1 = (Account)(ois.readObject());
            Account a2 = (Account)(ois.readObject());
            

            a1.display();
            a2.display();

            ois.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        } 
    }
}
