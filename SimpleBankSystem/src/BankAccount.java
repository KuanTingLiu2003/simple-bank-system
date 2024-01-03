/**
 * Interface for accounts in the bank system
 */
interface BankAccount {
    /**
     * Deposit amount to the account instance
     * @param amount - amount to deposit
     */
    void deposit(double amount);

    /**
     * Withdraw amount from the account instance
     * @param amount - amount to withdraw
     */
    void withdraw(double amount);

    /**
     * Set bank account balance
     * @param b - balance to set
     */
    void setBalance(double b);

    /**
     * Get the bank account instance balance
     * @return balance of bank account instance
     */
    double getBalance();

    /**
     * Store and set the bank account passcode
     * @param inputPasscode passcode to store
     */
    void setPasscode(String inputPasscode);

    /**
     * Validate passcode
     * @param inputPasscode input passcode to compare
     * @return true if passcode matches, false otherwise
     */
    boolean passCodeConfirm(String inputPasscode);

    /**
     * Calculate interest of the bank account instance
     * @param Month number of month with interest
     * @return interest rounded to the nearest integer
     */
    int getInterest(int Month);
}

/**
 * Standard Account Class
 */
class StandardAccount implements BankAccount {
    private String passcode;
    private double balance;
    private final double rate = 0.005;

    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void setBalance(double b) {
        this.balance = b;
    }
    public double getBalance() {
        return this.balance;
    }
    public void setPasscode(String inputPasscode) {
        this.passcode = inputPasscode;
    }
    public boolean passCodeConfirm(String inputPasscode) {
        return inputPasscode.equals(passcode);
    }
    public int getInterest(int Month) {
        return (int) Math.round(this.balance * (Math.pow((1 + rate), Month) - 1));
    }
}

/**
 * VIP Account Class
 */
class VIPAccount implements BankAccount {
    private String passcode;
    private double balance;
    private final double rate = 0.01;

    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void setBalance(double b) {
        this.balance = b;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setPasscode(String inputPasscode) {
        this.passcode = inputPasscode;
    }

    public boolean passCodeConfirm(String inputPasscode) {
        return inputPasscode.equals(passcode);
    }

    public int getInterest(int Month) {
        return (int) Math.round(this.balance * (Math.pow((1 + rate), Month) - 1));
    }
}
