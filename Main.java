import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            System.out.println("Invalid deposit amount.");
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds.");
            return false;
        }
    }

    public double checkBalance() {
        return balance;
    }
}

class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void run() {
        while (true) {
            menu();
            System.out.print("Enter choice: ");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful. Remaining balance: " + account.checkBalance());
                    }
                    break;
                case "2":
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (account.deposit(depositAmount)) {
                        System.out.println("Deposit successful. Current balance: " + account.checkBalance());
                    }
                    break;
                case "3":
                    System.out.println("Current balance: " + account.checkBalance());
                    break;
                case "4":
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(500); // Assuming initial balance is $500
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
