


import java.util.Scanner;

public class BankAccount {
    private int pin = 1234;
    private double balance = 10000;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our bank!");

        while (true) {
            System.out.println("\nEnter your PIN: ");
            int inputPin = scanner.nextInt();

            if (inputPin == pin) {
                System.out.println("PIN accepted. Choose an option:");
                System.out.println("1. Balance Enquiry");
                System.out.println("2. Cash Withdrawal");
                System.out.println("3. Change PIN");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        balanceEnquiry();
                        break;
                    case 2:
                        cashWithdrawal(scanner);
                        break;
                    case 3:
                        changePin(scanner);
                        break;
                    case 4:
                        System.out.println("Thank you for using our bank!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                }
            } else {
                System.out.println("Invalid PIN. Please try again.");
            }
        }
    }

    private void balanceEnquiry() {
        System.out.println("Your current balance is: " + balance);
    }

    private void cashWithdrawal(Scanner scanner) {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }

    private void changePin(Scanner scanner) {
        System.out.print("Enter new PIN: ");
        int newPin = scanner.nextInt();
        pin = newPin;
        System.out.println("PIN changed successfully!");
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.run();
    }
}


