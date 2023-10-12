import java.io.Console;

public class AdditionQuiz {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 10) + 1;
        int b = (int)(Math.random() * 10) + 1;

        Console con = System.console();

        System.out.print("What is " + a + " + " + b + "? ");
        int guess = Integer.parseInt(con.readLine());

        int answer = a + b;

        if(answer == guess) {
            System.out.println("You are correct.");
        } else {
            System.out.println("Wrong!!! The correct ansewr is "+answer);
        }
    }
}
