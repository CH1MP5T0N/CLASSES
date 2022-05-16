package Class;
import java.util.Scanner;
public class Main {
    static Bank bank = new Bank("THE BANK");
    static Scanner BANK = new Scanner(System.in);
    public static void main(String[] args){
        while(true){
            System.out.print("---THE BANK---\n");
            System.out.print("1. Create account\n2. Search account\n3. Display accounts\n4. Deposit to account\n5. Withdraw from account\n6. Exit\nMAKE YOUR CHOICE: ");
            int choice = BANK.nextInt();
            if (choice == 1) {
                Account acc = new Account(0);
                System.out.print("Enter first name: ");
                String peter = BANK.next();
                System.out.print("Enter last name: ");
                String nelson = BANK.next();
                bank.addCustomer(peter, nelson);
                bank.getCustomerInteger(bank.getNumOfCustomers()-1).setAccount(acc);
            }
            if (choice == 2) {
                System.out.print("Enter index: ");
                int idx = BANK.nextInt();

                if (0 < idx && idx <= bank.getNumOfCustomers()) {
                    System.out.printf("First Name:%s \n", bank.getCustomerInteger(idx - 1).getFirstname());
                    System.out.printf("Last Name:%s \n", bank.getCustomerInteger(idx - 1).getLastname());
                    System.out.printf("Balance:%f \n", bank.getCustomerInteger(idx - 1).getAccount().getBalance());
                } else {
                    System.out.print("INVALID\n");
                }}

            if (choice == 3) {
                for (int i = 0; i < bank.getNumOfCustomers(); i++) {
                    System.out.printf("First Name:%s \n", bank.getCustomerInteger(i).getFirstname());
                    System.out.printf("Last Name:%s \n", bank.getCustomerInteger(i).getLastname());
                    System.out.printf("Balance:%f \n", bank.getCustomerInteger(i).getAccount().getBalance());}
                }

            if (choice == 4) {
                System.out.print("Enter index: ");
                int index = BANK.nextInt();
                if (0 < index && index <= bank.getNumOfCustomers()) {
                    System.out.print("Insert deposit: ");
                    int amount = BANK.nextInt();
                    bank.getCustomerInteger(index - 1).getAccount().deposit(amount);
                    System.out.printf("Balance: %f \n", bank.getCustomerInteger(index - 1).getAccount().getBalance());
                }
            }

            if (choice == 5){
                System.out.print("Enter index: ");
                int inx = BANK.nextInt();
                if (0 < inx && inx <= bank.getNumOfCustomers()) {
                    System.out.print("How much would you like to withdraw: ");
                    int amount = BANK.nextInt();
                    bank.getCustomerInteger(inx -1).getAccount().withdraw(amount);
                    System.out.printf("Balance: %f \n", bank.getCustomerInteger(inx -1).getAccount().getBalance());
                }
                else{
                    System.out.print("INVALID\n");
                }
            }

            if (choice == 6){
                System.out.println("THANK YOU FOR USING THE 銀行");
                break;
            }
        }
    }
}