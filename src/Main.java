import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        //requirements: show balance, deposit, withdraw, exit.
        //balance and calcs done in doubles.
        //needs an interface that is readable.
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        double balance = 0;
        do{
            System.out.println("********");
            System.out.println("BANKING PROGRAM");
            System.out.println("********");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("********");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            switch (choice){
               case 1 -> showBalance(balance);
               case 2 -> balance = deposit(balance, scanner);
               case 3 -> balance = withdraw(balance, scanner);
               case 4 -> System.out.println("Thank you for your business!");
               default -> System.out.println("Please enter a valid number!");
            }
        }while(choice != 4);


        scanner.close();



    }
    static double showBalance(double balance){
        System.out.println("********");
        System.out.printf("$ %.2f \n", balance);
        return balance;
    }
    static double deposit(double balance, Scanner scanner){
        System.out.print("How much would you like to deposit? ");
        double deposit = scanner.nextDouble();
        if (deposit < 0){
            System.out.println("********");
            System.out.println("Deposit amount cannot be negative!");

        }else if (deposit < 0.01 && deposit > 0){
            System.out.println("********");
            System.out.println("Can't deposit less than a Penny");

        }else{
            balance += deposit;
            System.out.println("********");
            System.out.printf("$ %.2f \n", balance);
        }

        return balance;

    }
    static double withdraw(double balance, Scanner scanner){
        System.out.print("How much would you like to withdraw? ");
        double withdraw = scanner.nextDouble();
        if (withdraw > balance){
            System.out.println("********");
            System.out.println("Insufficient funds, Broke Boy!");

        }else if (withdraw < 0.01 && withdraw > 0){
            System.out.println("********");
            System.out.println("Can't deposit less than a Penny");

        }else{
            balance -= withdraw;
            System.out.println("********");
            System.out.printf("$ %.2f \n", balance);
        }
        return balance;
    }


}
