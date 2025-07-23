import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //there is a built-in constant of the Math Class
        /*
        System.out.println(Math.PI); //can use Math.PI for pi
        System.out.println(Math.E); //can use Math.E for e

        double result;

        //to access Math class you need to capitalize M
        result = Math.pow(2,3); //for .pow, the first num is the base and the second is the exponent
        System.out.println(result);
        result = Math.abs(-5); //.abs gives diff away from zero (absolute value of a number);
        System.out.println(result);
        result = Math.sqrt(25); //square root class
        System.out.println(result);
        result = Math.round(3.14); //rounds the value given to the nearest whole integer
        System.out.println(result);
        result = Math.ceil(3.14); //.ceil always rounds the value up to the next whole number
        System.out.println(result);
        result = Math.floor(3.14); //.floor always rounds the value down to the last whole number
        System.out.println(result);
        result = Math.max(10, 20);//gives the max between two values/variables
        System.out.println(result);
        result = Math.max(10, 20); //gives the min between two values/variables
        System.out.println(result);

        */

        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;
        double radius;

        //Hypotenuse = c = Math.sqrt(a^2 + b^2)
        System.out.print("Enter Length of A: ");
        a = input.nextDouble();
        System.out.print("Enter Length of B: ");
        b = input.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2)); //within the method you can use .pow as well
        System.out.println("The hypotenuse is: " + c + "cm") ;

        //circumference = 2 * Math.PI * radius;
        System.out.print("Enter the radius: ");
        radius = input.nextDouble();
        double circumference = 2 * Math.PI * radius;
        System.out.println("The circumference is: " + circumference + " cm");

        //area = Math.PI * Math.pow(radius, 2);
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area is: " + area + " cm²");

        //volume = (4.0/3.0) * Math.PI * Math.pow(radius,3)
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume is: " + volume + " cm³");

        //with printf instead of println we can pick the amount of digits we want to display
        System.out.printf("The circumference is: %.2f cm \n", circumference);
        System.out.printf("The area is: %.2f cm² \n", area);
        System.out.printf("The volume is: %.2f cm³\n", volume);


        input.close();

    }
}
