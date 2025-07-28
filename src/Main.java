import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //possible to have if statements within if statements
        //can have if, else if, else statements

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;



        if(isStudent){
            if (isSenior){
                System.out.println("You get a Senior discount of 20%");
                System.out.println("You get a Student discount of 10%");
                price *= 0.8;
                price *= 0.9;
            }else {
                System.out.println("You get a Student Discount of 10%");
                price *= 0.9;
            }

        } else{
            if (isSenior){
                System.out.println("You get a Senior discount of 20%");
                price *= 0.8;
            }
            price *=1;

        }

        System.out.printf("The price of a ticket is: $%.2f" ,price);




    }
}
