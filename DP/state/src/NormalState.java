public class NormalState implements AccountState {
    private double authorizedOverdraft = 100.0;
    private double serviceFee = 5.0;
    private double maxBalanceInterest = 10000.0;
    private double creditInterest = 0.01;
    private double debitInterest = 0.02;

    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
    }

    public boolean withdraw(Account account, double amount) {
        double overdraft = authorizedOverdraft;
        if (account.getBalance() + overdraft >= amount) {
            account.setBalance(account.getBalance() - amount);
            return true;
        } else {
            account.setBalance(account.getBalance() - serviceFee);
            return false;
        }
    }

    public void computeInterest(Account account) {
        if (account.getBalance() < 0) {
            double interest = debitInterest;
            account.setBalance(account.getBalance() - interest * account.getBalance());
        } else {
            double interestLimit = maxBalanceInterest;
            if (account.getBalance() > interestLimit)
                account.setBalance(account.getBalance() + interestLimit * creditInterest);
            else
                account.setBalance(account.getBalance() * (1 + creditInterest));
        }
    }
}
