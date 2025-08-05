import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException{


        //for loop = execute some code a CERTAIN amount of times

        Scanner scanner = new Scanner(System.in);
        //3 statements seperated by semi-colons
        //1st statement is a counter which is generally made to be i. also called a loop control variable
        //2nd statement is a condition, when we want to stop
        //3rd statement is the step statement. We can increment and decrement the counter
        //can increment or decrement by any size of a number
        //initialization, condition, counter

//        for(int i = 2; i < 10 ; i++ ){
//            System.out.println(i);
//
//        }

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 1; i < max +1; i++){
            System.out.println(i);
        }

        int start = 10;
        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!");

        scanner.close();


    }
}
