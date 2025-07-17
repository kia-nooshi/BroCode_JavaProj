public class Main {
    public static void main(String[] args){
        //Primitive Data Types
        int age; // declaration of a int var
        double gpa = 3.3; //ints are whole numbers and doubles are decimals
        //if you initialize a double and assign an integer it adds a .0
        age = 22; //initializing a var
        System.out.println(age);
        System.out.println(gpa);
        System.out.println("I am  " + age + " years old.");
        System.out.println("My GPA is: " + gpa);

        char grade = 'B'; //char means character and is enclosed within single quotes
        char currency = '$';
        System.out.println(grade);
        System.out.println(currency);

        boolean isStudent = false; //either true or false
        //camelCase is a popular way to name variables
        boolean forSale = true;
        System.out.println(forSale);
        System.out.println(isStudent);
        /* we don't typically output bools directly in the console
           but tend to use them more internally within a program
         */
        if(isStudent == true){ //can also be simplified to if (isStudent){
            System.out.println("Student is true");
        }else{
            System.out.println("Student is not true");
        }


        //Reference Data Types
        String name = "Kia"; //String declaration must be capitalized
        String food = "sushi";
        String car = "AE86";
        //can use String name in another string which is a process called String Concatenation
        System.out.println("Your fav food is " + food);
        System.out.println("Hello " + name);
        System.out.println("Your average letter grade is " + grade);
        System.out.println("You can add multiple vars like this: " + age + " " + currency + " " + name);

        if(forSale){
            System.out.println("There is a " + car + " for sale.");
        }

    }
}
