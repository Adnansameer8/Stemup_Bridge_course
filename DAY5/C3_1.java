public class C3_1 {
    // Instance attribute
    private double balance;

    // Constructor
    public C3_1(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance can't be negative. Setting to 0.");
            this.balance = 0;
        }
    }


    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public static void main(String[] args) {
        C3_1 account = new C3_1(1000.0);

        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500.0);       
        account.deposit(-100.0);      

        account.withdraw(200.0);     
        account.withdraw(2000.0);     
        account.withdraw(-50.0);    

        System.out.println("Final Balance: " + account.getBalance());
    }
}


