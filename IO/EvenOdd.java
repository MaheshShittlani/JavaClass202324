import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class EvenOdd {
    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("textfiles/numbers.dat"));
            
            for(int i = 1; i <= 100; i++) {
                int number = (int)(Math.random() * 1000);

                dos.writeInt(number);
            }

            dos.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException e) {
            System.out.println(e);
        }


        // Reading numbers.dat and seperating number

        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("textfiles/numbers.dat"));

            DataOutputStream evenDos = new DataOutputStream(new FileOutputStream("textfiles/even.dat"));

            DataOutputStream oddDos = new DataOutputStream(new FileOutputStream("textfiles/odd.dat"));

            int number;
            while (true) {
                try {
                    
                    number = dis.readInt();
                    if(number % 2 == 0) {
                        evenDos.writeInt(number);
                    } else {
                        oddDos.writeInt(number);
                    }
                } catch (EOFException e) {
                    break;
                }
                
            }

            dis.close();
            evenDos.close();
            oddDos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        
        // Display the content of all 3 files

        try {

            System.out.println("\n\nContent of numbers.dat ...");
            DataInputStream dis = new DataInputStream(new FileInputStream("textfiles/numbers.dat"));
            
            while (true) {
                try {
                    int number = dis.readInt();
                    System.out.print(number + " ");    
                } catch (EOFException e) {
                    break;
                }
            }
            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }


        try {

            System.out.println("\n\nContent of even.dat ...");
            DataInputStream dis = new DataInputStream(new FileInputStream("textfiles/even.dat"));
            
            while (true) {
                try {
                    int number = dis.readInt();
                    System.out.print(number+" ");    
                } catch (EOFException e) {
                    break;
                }
            }
            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }


        try {

            System.out.println("\n\nContent of odd.dat ...");
            DataInputStream dis = new DataInputStream(new FileInputStream("textfiles/odd.dat"));
            
            while (true) {
                try {
                    int number = dis.readInt();
                    System.out.print(number + " ");    
                } catch (EOFException e) {
                    break;
                }
            }
            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}