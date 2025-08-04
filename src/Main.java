import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //while loop = repeat some code forever while some condition remains true

        Scanner scanner = new Scanner(System.in);

        String name ="";
        /*
        //The below block allows for us skip prompts by just clicking enter
        if (name.isEmpty()){
            System.out.println("Enter Your Name: ");
            name = scanner.nextLine();
        }
        */

        //can use a while loop to prevent the skip of a prompt.
        while (name.isEmpty()){
            System.out.print("Enter Your Name: ");
            name = scanner.nextLine();
        } // must be cautious of infinite loops. Need to have someway to update our condition within the loop

        System.out.println("Hello " + name);

        String response = "";
        //can use while loops to throw users outside of the loop as well.
        while(!response.equals("Q")){
            System.out.print("You are playing a game, press Q to quit: ");
            response = scanner.next().toUpperCase();

        }

        System.out.println("You have quit the game!");

        int age = 0;
        System.out.print("Enter your Age:");
        age = scanner.nextInt();

        /* while(age < 0){
            System.out.println("Your Age can't be negative");
            System.out.print("Enter your Age: ");
            age = scanner.nextInt();
        } */


        //can also use a do while loop
        //this checks the condition of the while at the end of the "do" section of code
        //redoes the do if while is not true
        // do the code first then checks condition.
        do {
            System.out.println("Your Age can't be negative");
            System.out.print("Enter your Age: ");
            age = scanner.nextInt();
        } while(age < 0);

        System.out.println("You are " + age + " years old");

        scanner.close();


    }
}
