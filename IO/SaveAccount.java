import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveAccount {
    public static void main(String[] args) {
        Account a1 = new Account(101, "Alex", 12000, "123456");
        Account a2 = new Account(102, "Clark", 19000, "234561");

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("textfiles/accounts.dat"));

            oos.writeObject(a1);
            oos.writeObject(a2);

            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}