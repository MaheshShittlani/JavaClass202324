public class PossibleDominants {
    public static void main(String[] args) {
        int amount = 34679;

        int a = amount / 2000;
        amount = amount % 2000;
        
        int b = amount / 500;
        amount = amount % 500;


        System.out.println("2000 x " + a + " = " + a * 2000);
        System.out.println("500 x " + b + " = " + b * 2000);

    }
}
