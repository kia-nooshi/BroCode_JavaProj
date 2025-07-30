import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        //weight conversion program

        //declare vars

        int option;
        double weight;
        double convWeight;

        //welcome and prompt menus
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Please choose an option: ");
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();

        //if statements with options 1,2, and invalid
        if (option == 1){
            System.out.print("Please enter your weight in lbs: ");
            weight = scanner.nextDouble();
            convWeight = weight * 0.453592;
            System.out.printf("Your weight in kgs is: %.2f", convWeight);

        }else if (option ==2){
            System.out.print("Please enter your weight in kgs: ");
            weight = scanner.nextDouble();
            convWeight = weight * 2.2046;
            System.out.printf("Your weight in lbs is: %.2f", convWeight);
        }else {
            System.out.println("Not a valid option");
        }



    }
}
