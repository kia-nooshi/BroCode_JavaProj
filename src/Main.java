import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        //nested loop = A loop inside another loop
        // used often with DS&A

//        for (int j = 1; j <= 3; j++) {
//            for (int i = 1; i <= 9; i++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

        //matrix of a symbols
        System.out.print("Enter the # of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the # of columns: ");
        int columns = scanner.nextInt();
        System.out.print("Enter the symbol to use: ");
        String symbol = scanner.next();

        for (int j = 1; j <= rows; j++) {
            for (int i = 1; i <= columns; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        }


        scanner.close();




    }
}
