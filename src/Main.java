
public class Main {
    public static void main(String[] args){
        //varargs = allow a method to accept a varying # of arguments
        //makes the methods more flexible, no need for overloaded methods
        //java will pakc the arguments into an array
        //...(ellipsis)

        //System.out.println(add(1,2,3));
        System.out.println(add(1,2,3,4));

    }
    static int add(int... numbers){ // 3 dots is called an ellipses java packs the arguments into an array
        int sum = 0;

        for (int number: numbers){
            sum += number;
        }
        return sum;
    }

//    static double add(int a, int b){
//        return a + b;
//    }
//    static double add(int a, int b, int c){
//        return a + b + c;
//    }
//    static double add(int a, int b, int c, int d){
//        return a + b + c + d;
//    }
//    static double add(int a, int b, int c, int d, int e){
//        return a + b + c + d + e;
//    }
//    static double add(int a, int b, int c, int d, int e, int f){
//        return a + b + c + d + e + f;
//    }
//    static double add(int a, int b, int c, int d, int e, int f, int g){
//        return a + b + c + d + e + f + g;
//    }

}
