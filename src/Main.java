import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       Random random = new Random();
       int guess = 0;
       int counter = 0;
       int min = 1;
       int max = 100;
       int randomNum = random.nextInt(min,max + 1);
       System.out.println("Number Guessing Game!");
       System.out.printf("Guess a number between %d - %d\n", min, max);
       System.out.print("Enter a guess:");
       guess = scanner.nextInt();
       counter++;

       while (guess != randomNum){

           if (guess < min || guess > max){
               System.out.println("Guess not within bound of the game!");
           }else if (guess > randomNum){
               System.out.println("Too High! Try Again.");
           } else if (guess < randomNum) {
               System.out.println("Too Low! Try again.");
           }
           System.out.printf("Guess a number between %d - %d\n", min, max);
           System.out.print("Enter a guess:");
           guess = scanner.nextInt();
           counter++;
       }

        System.out.println("Congrats! You guessed the correct number: " + guess);
        System.out.println("It took you " + counter + " guesses!");


        /* can also use do while loop
           do{
            System.out.print("Enter a guess:");
            guess = scanner.nextInt();
            attempts++;
            if (guess < min || guess > max){
               System.out.println("Guess not within bound of the game!");
            }else if (guess > randomNum){
               System.out.println("Too High! Try Again.");
            } else if (guess < randomNum) {
              System.out.println("Too Low! Try again.");
            }else{
               System.out.println("Correct! the number was" + randomNum);
               System.out.println("# of attempts!" + attempts);
            }

           } while(guess != randomNum);

         */

       scanner.close();
    }
}
