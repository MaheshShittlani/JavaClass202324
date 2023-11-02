/**
 * May - 2001
 * ------------------
 * Count total skip days till 1-May-2001
 * ---------------------------------------- 
 *      1. Count skip days till 31-dec-2000 (done)
 *      2. Count skip days from 1-Jan-2001 to 30-Apr-2001
 */

import java.io.Console;

public class PrintCalendarMonth {
    private static int[] monthDays = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static String getMonthName(int m) {
        String[] months = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "Octomber", "November" ,"December"};

        return months[m - 1];
    }

    public static boolean isLeapYear(int y) {
        if(y % 400 == 0 || y % 100!=0 && y % 4 == 0) {
            return true;
        }

        return false;
    }

    public static int getTotalSkipDaysTillMonth(int m, int y) {
        if(isLeapYear(y)) {
            monthDays[1] = 29;
        } else {
            monthDays[1] = 28;
        }
        int skipDays = 0;
        for(int  i = 0; i < m - 1; i++) {
            skipDays += monthDays[i];
        }

        return skipDays;
    }
    
    public static int findFirstDay(int m, int y) {
        int skipDays = (y - 1) * 365;
        int leapDays = (y - 1) / 4 - (y - 1)/ 100 + (y - 1) / 400;

        // Find the skip days till m - 1
        int totalSkipDays = skipDays + leapDays + getTotalSkipDaysTillMonth(m, y) + 1;

        // Find currend day
        int currentDay = totalSkipDays % 7;
        return currentDay;
    }

    public static void printMothHeader(int m, int y) {
        String monthName = getMonthName(m);
        System.out.println(monthName + ", " + y);
        System.out.println("--------------------------------------");
        System.out.printf("%4s %4s %4s %4s %4s %4s %4s\n","Sun","Mon","Tue","Wed","Thu","Fri","Sat");
        System.out.println("---------------------------------------");
    }
    public static void printMonthCalendar(int m, int y) {
        printMothHeader(m, y);

        int totalDays = monthDays[m - 1];
        int currentDays = findFirstDay(m, y);

        int col = 0;
        while(col < currentDays) {
            System.out.printf("%4s "," ");
            col++;
        }        
        
        for(int i = 1; i <= totalDays; i++) {
            System.out.printf("%4s ", i);
            col++;

            if(col % 7 == 0) {
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Console con = System.console();

        System.out.print("Enter the month, say<1-12>: ");
        int m = Integer.parseInt(con.readLine());

        System.out.print("Enter the year: ");
        int y =  Integer.parseInt(con.readLine());

        printMonthCalendar(m, y);
    }
}
