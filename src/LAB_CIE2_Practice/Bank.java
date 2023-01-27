package LAB_CIE2_Practice;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance to withdraw: " + balance);
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(1000);

        Thread t1 = new Thread(() -> {
            account.deposit(500);
        });

        Thread t2 = new Thread(() -> {
            account.deposit(300);
        });

        Thread t3 = new Thread(() -> {
            account.withdraw(1500);
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Final balance: " + account.getBalance());
    }
}