public class Account {
    private double balance;
    private AccountState state;

    public Account() {
        balance = 0;
        state = new NormalState();
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposit(double amount) {
        state.deposit(this, amount);
    }

    public boolean withdraw(double amount) {
        return state.withdraw(this, amount);
    }

    public void computeInterest() {
        state.computeInterest(this);
    }

    public double getBalance() {
        return balance;
    }
}