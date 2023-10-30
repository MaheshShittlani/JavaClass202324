import java.io.Console;

public class AddMat {
    public static void main(String[] args) {
        int[][] m1, m2, m3;
        m1 = new int[10][10];
        m2 = new int[10][10];
        m3 = new int[10][10];

        int r1,c1, r2, c2;

        Console con = System.console();

        System.out.println("Enter the row and col for matrix-1: ");
        r1 = Integer.parseInt(con.readLine());
        c1 = Integer.parseInt(con.readLine());
        
        System.out.println("Enter the row and col for matrix-2: ");
        r2 = Integer.parseInt(con.readLine());
        c2 = Integer.parseInt(con.readLine());

        if(r1 != r2 || c1 != c2) {
            System.out.println("Can't Add");
            return; // System.exit(0)
        }


        // Input matrix-1
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                System.out.println("Enter m1["+i+"]["+j+"]? ");
                m1[i][j] = Integer.parseInt(con.readLine());
            }
        }

        // Input matrix-2
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {
                System.out.println("Enter m2["+i+"]["+j+"]? ");
                m2[i][j] = Integer.parseInt(con.readLine());
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }

        // Display result
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }


    }    
}
