import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //if statements = performs a block of code if its condition is true
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a Student (True/False): ");
        isStudent = scanner.nextBoolean();

        //Group 1
        if(name.isEmpty()){ //.isEmpty method can replace name == "" to check if the string is empty
            System.out.println("You didn't enter your name");
        }else{
            System.out.println("Hello " + name + "!");
        }

        //Group 2
        //you need to worry about the order of the statements as if any of them evaluate to true
        //it will just print that one. need to put statements you want in checking order
        if (age >= 65){
            System.out.println("You are a senior!");
        }
        else if (age >= 18){ //checks if that statement is true and prints
            System.out.println("You are an adult!");
        }else if (age < 0){ //allows you to add another if-clause into checking
            //can have as many else ifs as needed
            System.out.println("You are not born yet!");
        }else if (age == 11) { // to check equality you need == since = is the assignment operator
            System.out.println("You are 11");
        }
        else{ //if false then prints the below
            System.out.println("You are a child!");
        }

        //Group 3
        if (isStudent){ //for boolean you don't need to use == since bool already has a t/f value assigned
            System.out.println("You are a student!");
        }else{
            System.out.println("You are not a student!");
        }



        scanner.close();

    }
}
