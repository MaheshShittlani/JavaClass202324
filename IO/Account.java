import java.io.Serializable;
class Account implements Serializable {
    private int accountNumber;
    private String accountHolderName;
    private int balance;
    transient private String password;

    

    public Account(int accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    

    public Account(int accountNumber, String accountHolderName, int balance, String password) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.password = password;
    }

    public void display() {
        System.out.println("Acocunt Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance " + balance);
        System.out.println("Password: " + (password== null ? "XXXXXXXX": password));
    }

}
