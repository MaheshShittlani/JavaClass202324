import java.io.Console;

class LeapYear {
    public static void main(String[] args) {
        int y;
        Console con = System.console();

        System.out.print("Enter any year: ");
        y = Integer.parseInt(con.readLine());

        // Logic - 1
        // if(y % 100 == 0) {
        //     if(y % 400 == 0) {
        //         System.out.println(y+ " is a leap year");
        //     } else {
        //         System.out.println(y+ " is not a leap year");
        //     }
        // } else {
        //     if(y % 4 == 0) {
        //         System.out.println(y+ " is a leap year");
        //     } else {
        //         System.out.println(y+ " is not a leap year");
        //     }
        // }

        // Logic - 2 | 1996, 1600, 1800
        // if(y % 100 == 0 && y % 400 == 0 || y % 100 != 0 && y % 4 == 0) {
        //     System.out.println(y+ " is a leap year");
        // } else {
        //     System.out.println(y + " is not a leap year");
        // }
    
        // Logic - 3
        if(y % 400 == 0 || y % 100 != 0 && y % 4 == 0) {
            System.out.println(y+ " is a leap year");
        } else {
            System.out.println(y + " is not a leap year");
        }    
    }
}