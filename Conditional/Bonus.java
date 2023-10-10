public class Bonus {
    public static void main(String[] args) {
        int basicSalary = 17000;

        int bonus = 0;

        if(basicSalary <= 10000) {
            bonus = 2000;
        }

        System.out.println("Basic Salary: "+ basicSalary);
        System.out.println("Bonus: "+bonus);
        System.out.println("Total Salary: "+ (basicSalary + bonus));
    }
}
