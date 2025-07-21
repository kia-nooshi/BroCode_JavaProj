import java.util.Random; // to use random numbers we need to import the random class

public class Main {
    public static void main(String[] args){

        Random random = new Random(); // "Random" class, "random" object = new Random();


        int number;
        number = random.nextInt(100); //next int method which generates the random @
        //if there are no bounds in the .nextInt method then the range is -2billion to 2billion
        //the bottom bound is inclusive top bound is always exclusive so need to always put our desired
        //top bound +1
        System.out.println(number);


        // can also generate a double
        double doubleNum = random.nextDouble(11);
        System.out.println(doubleNum);

        // can also generate a boolean (useful when you need to flip a coin)
        boolean isHeads = random.nextBoolean();
        //System.out.println(isHeads);
        if (isHeads){
            System.out.println("Heads");
        }else{
            System.out.println("Tails");
        }









    }
}
