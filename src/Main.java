import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double temperature;
        String tempMeasurement;
        double convertedTemp;

        System.out.print("Enter the temperature: ");
        temperature = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        tempMeasurement = scanner.next().toLowerCase();; //can use method chaining to make it upper/lower case from here
        //original line: tempMeasurement = scanner.next();

        //tempMeasurement = tempMeasurement.toLowerCase();
        if((!tempMeasurement.equals("c") && !tempMeasurement.equals("f"))){
            System.out.println("Not a Valid Measurement");
        }else {

            convertedTemp = (tempMeasurement.equals("c")) ? (temperature - 32) * 5 / 9 : (temperature * 9 / 5) + 32;

            tempMeasurement = tempMeasurement.toUpperCase();
            System.out.printf("%.1f° %s", convertedTemp, tempMeasurement);

        }

        scanner.close();



    }
}
