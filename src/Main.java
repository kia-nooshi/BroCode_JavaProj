public class Main {
    public static void main(String[] args){

        //printf() = is a method used to format output

        // $[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        //we can insert the variables ^ into printf statements when we output string literals
        //for printf we have to manually enter the \n statement
        System.out.printf("Hello %s\n", name); //for Strings the specifier character is 's'
        System.out.printf("Your name starts with a %c\n", firstLetter); //for char the specifier character is 'c'
        System.out.printf("You are %d years old\n", age); //for ints the specifier character is 'd'
        System.out.printf("You are %f inches tall\n", height); //for double the specifier character is 'f'
        System.out.printf("Employed: %b\n", isEmployed); //for booleans the specifier character is 'b'


        //with setting the precision we can limit the amount of digits that display after the decimal
        double price1 = 9.99;
        double price2 = 100000.15;
        double price3 = -54.01;

        //by adding a .1 ,.2, .3 ,etc. after the %, we can determine the amount of digits we want to display
        System.out.printf("%.1f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.3f\n", price3);

        //[flags]
        //+ = output a plus for any positive numebers, negatives don't work
        //, = comma grouping separator adds comma at any thousand's place
        //( = negative numbers are enclosed in ()
        //space = display a minus if negative, space if positive
        System.out.printf("%+.2f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%(.2f\n", price3);

        //[width]
        //0 = zero padding you do this by entering 0 and then the number of 0s you want after the %
        //number = right justified padding , same as above but you just enter the number
        //negative number = left justified padding , same as above but negative
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

    }
}
