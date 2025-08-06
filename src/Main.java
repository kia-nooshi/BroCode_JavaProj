
public class Main {
    public static void main(String[] args){

        //overloaded methods = methods that share the same name, but different parameters
        //unique method signature = name + Parameters;
        //no two methods can share the same signatures
//        System.out.println(add(1,2, 3,4));
//        System.out.println(add(1,2,3));
//        System.out.println(add(1,2));

        String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");

        System.out.println(pizza);
    }
    static String bakePizza(String bread ){
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese ){
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping ){
        return topping + " " + cheese + " " + bread + " pizza";
    }


//    static double add(double a, double b){
//        return a + b;
//    }
//    //no two methods can share the same signature, they can have the same name but not same params
//    static double add(double a, double b, double c){
//        return a + b + c;
//    }
//    static double add(double a, double b, double c, double d){
//        return a + b + c + d;
//    }


}
