package oopj24cseb61;
import java.util.Scanner;

class MyCustomBank {
    Scanner sc = new Scanner(System.in);
    public String accNo;
    public String accType;
    public String name;
    public long balance;

    void OpenAccount() {
        System.out.print("Enter Account Number: ");
        this.accNo = sc.next();
        sc.nextLine();
        System.out.print("Enter Account Type: ");
        this.accType = sc.nextLine();
        System.out.print("Enter Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Balance: ");
        this.balance = sc.nextLong();
    }

    public void DisplayAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account number: " + accNo);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + balance);
    }

    public void SearchAccount(int accNo1) {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account number: " + accNo);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + balance);
    }

    public void DepositAmount() {
        System.out.print("Enter the amount you want to deposit: ");
        long deposit = sc.nextLong();
        try {
            if (deposit <= 0) {
                throw new InvalidAmountException("Invalid amount!\nAmount must be greater than 0");
            } else {
                balance += deposit;
                System.out.println("Deposit Successful!\nNew balance: " + balance);
            }
        } catch (InvalidAmountException e) {
            System.out.print(e.getMessage());
        }
    }

    public void Withdraw() {
        System.out.print("Enter the amount you want to withdraw: ");
        long withdraw = sc.nextLong();
        try {
            if (withdraw <= 0) {
                throw new InvalidAmountException("Invalid amount!\nAmount must be greater than 0.");
            }
            if (balance < withdraw) {
                throw new InsufficientFundsException("Withdrawal denied!\nInsufficient balance for withdrawal.");
            }

            balance -= withdraw;
            System.out.println("Withdrawal Successful!\nNew balance: " + balance);

        } catch (InsufficientFundsException e) {
            System.out.print(e.getMessage());
        } catch (InvalidAmountException e) {
            System.out.print(e.getMessage());
        }
    }
}

public class CustomBank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int n = sc.nextInt();
        sc.nextLine();
        MyCustomBank[] b = new MyCustomBank[n];
        for (int i = 0; i < n; i++) {
            b[i] = new MyCustomBank();
            System.out.println("Enter the Account " + (i + 1) + " Details: ");
            b[i].OpenAccount();
            System.out.println();
        }
        do {
            System.out.println("\n*Banking System Application*");
            System.out.println("1.Display all Accounts\n2.Search Account\n3.Deposit amount\n4.Withdraw\n5.Exit");
            System.out.println("Enter the choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println("Account: " + (i + 1));
                        b[i].DisplayAccount();
                    }
                    break;
                case 2:
                    int flag = 0;
                    System.out.println("Enter the account number to be searched: ");
                    String accNo1 = sc.next();
                    for (int i = 0; i < n; i++) {
                        if (b[i].accNo.equals(accNo1)) {
                            b[i].DisplayAccount();
                            flag = 1;
                        }
                    }
                    if (flag == 0) {
                        System.out.println("Invalid account number");
                    }
                    break;
                case 3:
                    int flag1 = 0;
                    System.out.println("Enter the account number: ");
                    String accNo2 = sc.next();
                    for (int i = 0; i < n; i++) {
                        if (b[i].accNo.equals(accNo2)) {
                            b[i].DepositAmount();
                            flag1 = 1;
                        }
                    }
                    if (flag1 == 0) {
                        System.out.println("Invalid account number");
                    }
                    break;
                case 4:
                    int flag2 = 0;
                    System.out.println("Enter the account number: ");
                    String accNo3 = sc.next();
                    for (int i = 0; i < n; i++) {
                        if (b[i].accNo.equals(accNo3)) {
                            b[i].Withdraw();
                            flag2 = 1;
                        }
                    }
                    if (flag2 == 0) {
                        System.out.println("Invalid account number");
                    }
                    break;
                case 5:
                    System.out.println("See you soon...\n"
                            + "\n"
                            + "**************************\n"
                            + "Thank You :) Visit again\n"
                            + "**************************");
                    return;
                default:
                    System.out.print("Invalid choice");
                    break;
            }
        } while (true);
    }
}
