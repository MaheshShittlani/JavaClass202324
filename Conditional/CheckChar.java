import java.io.Console;

public class CheckChar {
    public static void main(String[] args) {
        Console con = System.console();
        System.out.print("Enter any character: ");
        char ch = con.readLine().charAt(0);
        System.out.println("Character: " + ch);
        if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            System.out.print(ch + " is an alphabet");
            if(ch >= 'A' && ch <= 'Z') {
                System.out.println(" and in uppercase.");
            } else {
                System.out.println(ch + " and is in lowercase.");
            }

            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("It is a vowel");
            } else {
                System.out.println("It is a consonent");
            }
        } else if(ch >= '0' && ch >= '9'){
            System.out.println(ch + " is a digit");
        } else if(ch == 32 || ch == '\n' || ch == '\t') {
            System.out.println("It is a white space");
        } else {
            System.out.println(ch + " is an special symbol");
        }
    }
}
