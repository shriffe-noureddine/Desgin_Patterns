public interface AccountState {
    void deposit(Account account, double amount);
    boolean withdraw(Account account, double amount);
    void computeInterest(Account account);
}