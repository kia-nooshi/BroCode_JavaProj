import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        String[] fruits = {"apple", "orange", "banana"};
        boolean isFound = false;
        String target;
        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();
        //int target = 9;


//        for (int i = 0; i < numbers.length; i++){
//            if (target == numbers[i]){
//                System.out.println("Element found at index: " + i);
//                isFound = true;
//                break;
//            }
//        }

        for (int i = 0; i < fruits.length; i++){
            if (fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in array!");
        }


        scanner.close();
    }
}
