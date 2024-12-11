import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    double balance;

    public BankAccount(String name) {
        accountHolder = name;
        balance = 0.0;
    }

    public void deposit (double amount) {
        balance += amount;
    }

    public void withdraw (double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance! You can't withdraw anymore.....");
        } else {
            balance -= amount;
        }
    }

    public void checkbalance () {
        System.out.println("Current Balance: " + balance);;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        BankAccount account = new BankAccount(name);

        while (true) {
            System.out.println("choose an option: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();

                account.deposit(depositAmount);
                break;

                case 2:
                System.out.println("Enter withdrawal amount: ");
                double withdrawalAmount = scanner.nextDouble();

                account.withdraw(withdrawalAmount);
                break;

                case 3:
                account.checkbalance();
                break;

                case 4:
                System.out.println("exiting..............");
                scanner.close();
                return;
                default:
                System.out.println("Invalid choice!!!Please try again........");
            }

        }
    }
}