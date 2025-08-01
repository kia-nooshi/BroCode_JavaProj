
public class Main {
    public static void main(String[] args){

        //ternary operator (question mark followed by 1 of 2 values) ? = Return 1 of 2 values if a condition is true
        //variable = (condition) ? ifTrue : ifFalse;
        //simpler version of an if else statement

        int score = 70;

        /*
        if (score >= 60){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        } */ //regular if statement, using a ternary operator we can rewrite this

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        // Data type initialized with a condition followed by a ? and two outcomes (if true : if false)

        System.out.println(passOrFail);

        int number = 3;

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        System.out.println(evenOrOdd);

        int hours = 13;

        String timeOfDay = (hours < 12) ? "AM" : "PM";
        System.out.println(timeOfDay);

        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);

    }
}
