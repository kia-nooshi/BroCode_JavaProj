import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        //methods = a block of reusable code that is executed when called ()
        //D.R.Y principle = Don't Repeat Yourself
        //methods are unfamiliar with variables declared in other methods
        //we can send arguments (vars) to other methods from another methods

        String name = "Kia";
        int age = 22;

        happyBirthday(name, age);

        double result = square(3);
        System.out.println(result);

        System.out.println(cube(4));

        String fullName = getFullName("Kia", "Nooshi");
        System.out.println(fullName);

        if (ageCheck(age)){
            System.out.println("You can sign up!");
        }else{
            System.out.println("You must be 18+ to sign up");
        }




    }
    //need a return type, name for method, parenthesis, and curly braces
    //method needs to be static if being called from another method that is static
    //can rename them but order and data type of what is being passed needs to match
    //methods have the capability of returning a value
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old! \n", age);
        System.out.println("Happy Birthday to you! \n");

    }

    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        return age >= 18;
        // ^ simplified version of
        // if(age >= 18){
        //            return true;
        //        } else{
        //            return false;
        //        }
    }
}
