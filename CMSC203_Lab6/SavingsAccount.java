package package1;

public class SavingsAccount extends BankAccount {
    // Instance variables
    private static final double RATE = 0.025; // Annual interest rate (2.5%)
    private int savingsNumber = 0;            // Savings account number
    private String accountNumber;            // Hidden account number

    /**
     * Constructor for SavingsAccount
     * @param name The name of the account owner
     * @param initialBalance The initial deposit amount
     */
    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance); // Call superclass constructor
        // Initialize account number
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    /**
     * Method to post monthly interest to the account.
     * Deposits one month's interest into the account.
     */
    public void postInterest() {
        // Calculate monthly interest
        double monthlyInterest = (getBalance() * RATE) / 12;
        // Deposit the interest
        deposit(monthlyInterest);
    }

    /**
     * Overrides the getAccountNumber method from the superclass.
     * @return The account number with the savings extension
     */
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Copy constructor to create a new savings account for the same owner.
     * @param originalAccount The original savings account to copy
     * @param initialBalance The initial balance for the new account
     */
    public SavingsAccount(SavingsAccount originalAccount, double initialBalance) {
        super(originalAccount, initialBalance); // Call superclass copy constructor
        // Increment savingsNumber
        this.savingsNumber = originalAccount.savingsNumber + 1;
        // Update the account number
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }
}
