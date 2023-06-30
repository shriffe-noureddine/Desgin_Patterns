public class TestAccount {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(100);
        acc.computeInterest();
        System.out.println("interests for a balance of 100: " + acc.getBalance());

        acc = new Account();
        acc.deposit(50000);
        acc.computeInterest();
        System.out.println("interests for a balance of 50000: " + acc.getBalance());

        acc = new Account();
        if (!acc.withdraw(150))
            System.out.println("balance below 100 rejected!");

        acc = new Account();
        if (!acc.withdraw(100))
            System.out.println("balance below 100 rejected!");

        acc.computeInterest();
        System.out.println("interests for a balance of -100: " + acc.getBalance());
    }
}