import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //compound interest calculator
        //Compound interest formula = P[1+(r/100/n)]^nt
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        double compound;
        int time;
        double investment;

        System.out.print("Enter principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter rate amount (in %): ");
        rate = scanner.nextDouble();
        // can also be rate = scanner.nextDouble()/100;
        System.out.print("Enter the amount of times the interest compounds yearly: ");
        compound = scanner.nextInt();
        System.out.print("Enter the number of years: ");
        time = scanner.nextInt();

        investment = principal* (Math.pow((1 + ((rate/100) / compound)), (compound * time)));
        if (time == 1) {
            System.out.printf("Investment after " + time + " year is $%.2f%n", investment);
        }else{
            System.out.printf("Investment after " + time + " years is $%.2f%n", investment);
        }

        scanner.close();



    }
}
