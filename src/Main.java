import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("What number of food do you want?: ");
        size = scanner.nextInt();
        //create empty array with the size of the array before filling in the values
        foods = new String[size];
        scanner.nextLine();

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }




        scanner.close();

    }
}
