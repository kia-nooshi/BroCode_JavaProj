
public class Main {

    static int x = 3;//CLASS scope which can be accessed from the other methods
    //var is outside in the street
    //Local variables that share the same name as a class variable will take precedent
    //Class vars are useful with Object oriented programming and/or when we have constants

    public static void main(String[] args){
        //variable scope = where a variable can be accessed

        //inside of a method if you declare a variable it has a local scope
        //it won't be recognized in another method
        int x = 1; //LOCAL
        System.out.println(x);
        doSomething();
    }
    static void doSomething(){
        int x = 2;//vars can have same names in different methods since they have the local scopes
        System.out.println(x);
    }
}
