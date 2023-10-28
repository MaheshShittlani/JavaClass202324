class Account {
    private String accountNumber;
    private String accountHolderName;
    private float balance;
    private static int count = 100;
    
    public Account(String accountHolderName, float intialBalance) {
        this.accountNumber = "ICICI"+ (++count);
        this.accountHolderName = accountHolderName;
        balance = intialBalance;
    }

    public Account(String accountHolder) {
        this(accountHolder, 0);
    }

    public void deposit(float amount) {
        this.setBalance(balance + amount);
    }

    public void withdraw(float amount) {
        if(balance < amount) {
            System.out.println("Insufficient balance");
            return;
        }

        this.setBalance(balance - amount);
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public String getAccountInfo() {
        return accountNumber + " | " + accountHolderName + " | " + balance;
    }
}

class TestAccount {
    public static void main(String[] args) {
        // Account.class => count = 103
        Account a1 = new Account("Alex"); // ICICI101, Alex, 0
        Account a2 = new Account("Clark"); // ICICI102, Clark, 0
        Account a3 = new Account("Tiger", 55000); // ICICI103, Tiger, 55000

        System.out.println(a1.getAccountInfo());
        System.out.println(a2.getAccountInfo());
        System.out.println(a3.getAccountInfo());
    }
}
