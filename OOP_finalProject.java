package JAVA_OOP;



// 1. ABSTRACTION: We create a general concept of a BankAccount.
// We make it 'abstract' because you can't open a generic "Bank Account" in real life;
// you have to open a specific type, like Checking or Savings.


abstract class BankAccount {
    
    // 2. ENCAPSULATION: We make the balance 'private'. 
    // No outside code can do `account.balance = 1000000;`.
    // They MUST use our deposit and withdraw methods.

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Controlled ways to interact with the private balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into " + accountNumber + ". Balance: $" + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from " + accountNumber + ". Balance: $" + balance);
        } else {
            System.out.println("Failed to withdraw $" + amount + ". Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    // Abstraction part 2: We force all child classes to create a monthly update rule,
    // but we don't define what that rule is here.
    abstract void processMonthlyUpdate();
}

// 3. INHERITANCE: SavingsAccount gets all the balance, deposit, 
// and withdraw logic from BankAccount for free using 'extends'.
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance); // Passes values to the parent class
        this.interestRate = interestRate;
    }

    // 4. POLYMORPHISM: We 'override' the abstract method to do exactly 
    // what a Savings Account should do (add interest).
    @Override
    void processMonthlyUpdate() {
        double interestEarned = getBalance() * interestRate;
        System.out.println("Applying interest to Savings...");
        deposit(interestEarned); 
    }
}

// 3. INHERITANCE: CheckingAccount also extends BankAccount.
class CheckingAccount extends BankAccount {
    private double monthlyFee;

    public CheckingAccount(String accountNumber, double initialBalance, double monthlyFee) {
        super(accountNumber, initialBalance);
        this.monthlyFee = monthlyFee;
    }

    // 4. POLYMORPHISM: Checking Accounts don't get interest, they get charged a fee.
    // Same method name, completely different behavior.
    @Override
    void processMonthlyUpdate() {
        System.out.println("Deducting monthly fee from Checking...");
        withdraw(monthlyFee);
    }
}

// --- The Main Program ---
public class OOP_finalProject {
    public static void main(String[] args) {
        
        // Let's create our objects!
        SavingsAccount mySavings = new SavingsAccount("SAV-001", 1000.0, 0.05); // 5% interest
        CheckingAccount myChecking = new CheckingAccount("CHK-999", 500.0, 15.0); // $15 fee

        System.out.println("--- Performing Transactions ---");
        mySavings.deposit(2000);
        myChecking.withdraw(100);
        myChecking.withdraw(1000); // This will trigger our Encapsulation safety check!

        System.out.println("\n--- Processing End of Month ---");
        mySavings.processMonthlyUpdate();
        myChecking.processMonthlyUpdate();
    }
}
    

