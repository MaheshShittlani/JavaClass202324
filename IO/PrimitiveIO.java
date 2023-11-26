import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveIO {
    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("textfiles/primitive.dat"));

            dos.writeInt(101); // EMPID
            dos.writeFloat(15000.98f); // Salary
            dos.writeBoolean(false); // Marital status
            dos.writeUTF("Alex");
            dos.close();


            DataInputStream dis = new DataInputStream(new FileInputStream("textfiles/primitive.dat"));

            System.out.println("EmpID: " + dis.readInt());
            System.out.println("Salary: "+ dis.readFloat());
            System.out.println("Is Married: " + dis.readBoolean());
            System.out.println("Name: " + dis.readUTF());

            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
