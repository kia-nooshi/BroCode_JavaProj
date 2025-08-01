import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //&& = AND
        //|| = OR
        //! = NOT

        /*
        double temp = 20;
        boolean isSunny = false;

        //all conditions must be true for the code to run within the if
        if (temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is good!");
            System.out.println("It is sunny outside");
        }else if(temp <= 30 && temp >= 0 && !isSunny){ //! check the opposite of the condition true
            System.out.println("The weather is good!");
            System.out.println("It is cloudy outside");
        }else if (temp > 30 || temp < 0){ //with || (OR) at least one condition must be true
            System.out.println("The weather is bad");
        }
        */


        //checks if the username is valid
        //username must be between 4-12 characters
        //username cannot contain spaces or underscores

        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

         if (username.length() < 4 || username.length() > 12){
             System.out.println("Username is of invalid length! Must be between 4-12 characters.");
         }else if (username.contains("_") || username.contains(" ")){
             System.out.println("Username contains invalid characters! Must not contain spaces or underscores");
         }else{
             System.out.println("Nice Username CUH!");
         }


        scanner.close();




    }
}
