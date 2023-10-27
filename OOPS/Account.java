class Account {
    private String accountNumber;
    private String accountHolderName;
    private float balance;
    
    public Account(String accountNumber, String accountHolderName, float intialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        balance = intialBalance;
    }

    public Account(String accountNumber, String accountHolder) {
        this(accountNumber, accountHolder, 0);
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
