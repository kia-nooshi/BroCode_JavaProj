import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Scanner is an object that allows us to accept user inputs in Java
        //to use it we need to import it from util using import java.util.Scanner;

        //typically accept input, process it, then output
        //create scanner by calling Scanner class
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.print("Enter your name: ");
        //below allows user to give the input and declares and assigns it to the name variable
        //.nextLine only works for Strings
        String name = scanner.nextLine(); //if we use .next instead it would not read spaces

        System.out.print("Enter your age: ");
        //.nextInt() is used to read an integer
        int age = scanner.nextInt();

        System.out.print("What is your GPA: ");
        //.nextDouble() is used to read doubles
        double GPA = scanner.nextDouble();

        System.out.print("Are you a Student? (true/false): ");
        //.nextBoolean() is used to read in Booleans
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello! " + name );
        System.out.println("Your age is " + age + " years old!");
        System.out.println("Your GPA is " + GPA);
        // we like if statements to output bools
        if (isStudent) {
            System.out.println("You are enrolled as a Student");
        } else {
            System.out.println("You are NOT enrolled as a Student");
        }

        */

        /*
        //COMMON ISSUES
        System.out.print("Enter your Age: ");
        int ageInt = scanner.nextInt();

        //if taking in string after int or others the scanner will read the enter(/n) as the integer
        //to clear that place another scanner.nextLine() method after your int scanner.

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("Your favorite color is " + color);

        */

        //calculate width of a rectangle
        double width = 0; //initializing it with a 0 is redundant here;
        double height = 0;
        double area = 0;

        System.out.print("Enter width in cm: ");
        //don't need to initialize width again since we already did that.
        width = scanner.nextDouble();
        System.out.print("Enter height in cm: ");
        height = scanner.nextDouble();

        area = width + height;

        System.out.println("The area is: " + area + " cm^2");


        //.close is close method which we use at the end of our program to avoid unexpected behavior
        scanner.close();

    }
}
