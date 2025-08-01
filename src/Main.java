import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /, ^):  ");
        //String operator = scanner.next(); this is ok but can allow the user to enter more than one value
        char operator = scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        //double output; don't need it

        /* below version works but the second version below that is more intuitive due to grouping of division logic
        if (operator == '/' && num2==0){ //operator.equals("/") N/A since .equals does not work on a char
            System.out.println("Cannot Divide By 0!");
        }else{
            switch (operator){
                case '+' -> System.out.println(num1 + num2);//output = num1 + num2;
                case '-' -> System.out.println(num1 - num2);
                case '*' -> System.out.printf("%.4f", num1 * num2);
                case '/' -> System.out.printf("%.4f", num1 / num2);
                case '^' -> System.out.printf("%.4f", Math.pow(num1,num2));
                default -> System.out.println("Invalid Operator!");

            }
        } */


        switch (operator) {
            case '+' -> System.out.println(num1 + num2);//output = num1 + num2;
            case '-' -> System.out.println(num1 - num2);
            case '*' -> System.out.printf("%.4f", num1 * num2);
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot Divide by Zero!");
                } else {
                    System.out.printf("%.4f", num1 / num2);
                }

            }
            case '^' -> System.out.printf("%.4f", Math.pow(num1, num2));
            default -> System.out.println("Invalid Operator!");
        }



        scanner.close();



    }
}
