import java.io.Console;

class Student {
    private int roll;
    private String name;
    private int m1, m2, m3;
    
    public void input() {
        Console con = System.console();

        System.out.print("Enter roll number: ");
        roll = Integer.parseInt(con.readLine());

        System.out.print("Enter name: ");
        name = con.readLine();

        System.out.print("Enter 3 subject marks: ");
        m1 = Integer.parseInt(con.readLine());
        m2 = Integer.parseInt(con.readLine());
        m3 = Integer.parseInt(con.readLine());
    }

    private int total() {
        return m1 + m2 + m3;
    }

    private float per() {
        return total() / 3.0f;
    }

    private char grade() {
        float per = per();
        if(per >= 85) {
            return 'S';
        } else if(per >= 75) {
            return 'A';
        } else if(per >= 65) {
            return 'B';
        } else if(per >= 55) {
            return 'C';
        } else if(per >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public void display() {
        System.out.println();
        System.out.println("Roll no: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Sub1: " + m1);
        System.out.println("Sub2: " + m2);
        System.out.println("Sub3: " + m3);
        System.out.println("Total: " + total());
        System.out.println("Percentage: "+ per());
        System.out.println("Grade: "+ grade());
        System.out.println("------------------------------------------------");
    }
}
