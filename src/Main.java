import java.util.Scanner;
import java.util.Random;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int total = 0;
    public static void main(String[] args){
        Random random = new Random();
        int numRolls;
        int dicenum;

        System.out.print("Enter the number of dice to roll: ");
        numRolls = scanner.nextInt();


        if (numRolls <= 0){
            System.out.println("You can't 0 dice!");
        }else{
            System.out.printf("Rolling %d dice... \n", numRolls);
            for (int i = 0; i < numRolls; i++){
                dicenum = random.nextInt(1,7);
                diceRoll(dicenum);
                System.out.printf("You rolled: %d \n", dicenum);
                total += dicenum;

            }
            System.out.printf("Total of all rolls: %d \n", total);
        }



        scanner.close();

    }
    static void diceRoll(int dicenum){
        switch (dicenum) {
            case 1 -> {
                System.out.println(" _____ ");
                System.out.println("|     |");
                System.out.println("|  ●  |");
                System.out.println("|     |");
                System.out.println(" ----- ");
            }
            case 2 -> {
                System.out.println(" _____ ");
                System.out.println("| ●   |");
                System.out.println("|     |");
                System.out.println("|   ● |");
                System.out.println(" ----- ");
            }
            case 3 -> {
                System.out.println(" _____ ");
                System.out.println("| ●   |");
                System.out.println("|  ●  |");
                System.out.println("|   ● |");
                System.out.println(" ----- ");
            }
            case 4 -> {
                System.out.println(" _____ ");
                System.out.println("|●   ●|");
                System.out.println("|     |");
                System.out.println("|●   ●|");
                System.out.println(" ----- ");
            }
            case 5 -> {
                System.out.println(" _____ ");
                System.out.println("|●   ●|");
                System.out.println("|  ●  |");
                System.out.println("|●   ●|");
                System.out.println(" ----- ");
            }
            case 6 -> {
                System.out.println(" _____ ");
                System.out.println("|●   ●|");
                System.out.println("|●   ●|");
                System.out.println("|●   ●|");
                System.out.println(" ----- ");
            }
            default -> System.out.println("Invalid roll!");
        }

    }

}
