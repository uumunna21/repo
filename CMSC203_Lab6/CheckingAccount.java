package package1;

public class CheckingAccount extends BankAccount {
    // Static constant for check clearing fee
    private static final double FEE = 0.15;

    /**
     * Constructor for CheckingAccount
     * @param name The name of the account owner
     * @param initialAmount The initial deposit amount
     */
    public CheckingAccount(String name, double initialAmount) {
        super(name, initialAmount); // Call superclass constructor
        // Append "-10" to the account number
        setAccountNumber(getAccountNumber() + "-10");
    }

    /**
     * Overrides the withdraw method to include the fee for check clearing.
     * @param amount The amount to withdraw
     * @return true if withdrawal was successful, false otherwise
     */
    @Override
    public boolean withdraw(double amount) {
        // Add the FEE to the withdrawal amount
        double totalAmount = amount + FEE;
        // Call the superclass withdraw method
        return super.withdraw(totalAmount);
    }
}

