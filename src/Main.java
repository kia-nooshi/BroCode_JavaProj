import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //MAD LIBS GAME
        Scanner input = new Scanner(System.in);

        String adj1;
        String noun1;
        String adj2;
        String verb1;
        String adj3;

        System.out.print("Enter an adjective: ");
        adj1 = input.nextLine();
        System.out.print("Enter a noun: ");
        noun1 = input.nextLine();
        System.out.print("Enter an adjective: ");
        adj2 = input.nextLine();
        System.out.print("Enter a verb end with -ing: ");
        verb1 = input.nextLine();
        System.out.print("Enter an adjective: ");
        adj3 = input.nextLine();

        System.out.println("\nToday I went to a " + adj1 + "zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adj2 + " and " + verb1 + "!");
        System.out.println("I was " + adj3 + "!");

        input.close();



    }
}
