import java.util.*;
class Atm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance=1000;
        int pin =1234;
        System.out.print("Enter PIN : ");
        int correct_pin = sc.nextInt();
        if(pin != correct_pin){
            System.out.println("Invalid pin..Try Again..!");
        }
        else{
        while(true){
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice : ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println(balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit : ");
                    int amount = sc.nextInt();
                    balance = balance + amount;
                    System.out.println(amount + " Deposited Successfully..!");
                    break;
                case 3:
                    System.out.print("Enter the amount to Withdraw : ");
                    int withdraw_amount = sc.nextInt();
                    if(withdraw_amount > balance){
                        System.out.println("Insufficient Balance...");
                    }
                    else{
                        System.out.println(withdraw_amount + " Withdrawn Successfully...");
                        balance -= withdraw_amount;
                    }
                    break;
                case 4:
                    System.out.println("Thank you... visit again.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input...");
            }
        }
        }
    }
}