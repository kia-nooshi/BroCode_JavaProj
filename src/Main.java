import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //shopping cart program
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        //can initialize a char currency = '$' if we want but is unnecessary
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each " + item + "?: ");
        price = scanner.nextDouble();

        System.out.print("How many " + item + "'s would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("You have bought " + quantity + " " + item + "/s.");
        System.out.println("Your total is $" + total);


        //don't forget to close the scanner
        scanner.close();

    }
}
