import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Enhanced switch = a replacement to many else if statements
        //(Java 14 feature)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();
        //arrow operator means do something
        switch(day){
            /* case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is a weekend");
            case "Sunday" -> System.out.println("It is a weekend"); */
            //can comma separate the cases above to combine them into one case
            case "Monday","Tuesday", "Wednesday", "Thursday", "Friday"  -> System.out.println("It is a Weekday");
            case "Saturday", "Sunday"  -> System.out.println("It is the Weekend");
            default -> System.out.println(day + " is not a day"); //default behaves similarly to an else statement
        }

    }
}
