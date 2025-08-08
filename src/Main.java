import java.util.Arrays;
public class Main {
    public static void main(String[] args){

        //array = a collection of values of the same data type
        // * think of it as a variable that can store more than 1 value *

        //after data types add [] and enclose all values in {} to turn a var into an array
        String[] fruits = {"apple", "orange", "banana", "coconut"};
        //just printing the var name gives the memory address
        //System.out.println(fruits);
        System.out.println(fruits[0]);//first element is index 0 last is length-1
        //if you try accessing element that does not exist you get an exception
        fruits[0]="pineapple"; //to reassign an element of an array
        System.out.println(fruits[0]);

        int numOfFruits = fruits.length; //returns length of array;
        System.out.println(numOfFruits);

        //to print all values of an array you can use a for loop
        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
            System.out.print(fruits[i] + " ");
        }

        //enhanced for loop also called a for each loop
        for(String fruit : fruits){ //first fruit is the iterating var
            System.out.print(fruit + ", ");
        }

//        Arrays.sort(fruits); sorts the string array alphabetically
//        Arrays.fill(fruits, "pineapple"); fills all elements with the given value
//
//        for(String fruit : fruits){ //first fruit is the iterating var
//            System.out.println(fruit);
//        }








    }
}
