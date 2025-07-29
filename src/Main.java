
public class Main {
    public static void main(String[] args){

        String name = "Kia Nooshi";

        //to get the length of the string you can use the length method: .length
        int length = name.length();

        //.charAt() method will give you the character at a specified index
        //indexes start at 0
        char letter = name.charAt(2);

        //.indexOf method returns the index of the first occurence of a specific letter inside of a string.
        //returns -1 if the char is not found. it is capital sensitive.
        int index = name.indexOf("N");

        //.lastIndexOf() returns the last instance of a given character inside of a string
        int lastIndex = name.lastIndexOf("o");

        //.toUpperCase() will make all the letters upper case
        name = name.toUpperCase();
        //.toLowerCase() will make all letters lower case
        name = name.toLowerCase();

        //.trim() gets rid of the white space at the beginning or end of a string
        name = name.trim();

        //.replace("initial char", "new char") replaces all instances of a character with another
        //name = name.replace("o", "i");

        //.isEmpty() returns a boolean of true or false whether a string is empty or not;
        //useful in an if statement
        if(!name.isEmpty()){
            System.out.println("Hey " + name);
        }else{
            System.out.println("Name is empty");
        }

        //.contains() returns a boolean that has a character
        if(name.contains(" ")){
            System.out.println("Your name has a space");
        }else{
            System.out.println("Your name has no spaces");
        }

        //.equals() checks if a string is equal to (has same characters exactly) the string inside of the method
        if(name.equals("kia nooshi")){
            System.out.println("Your name is hawt");
        }else{
            System.out.println("Your name is not hawt");
        }



        System.out.println(name);
        System.out.println(lastIndex);
        System.out.println(index);
        System.out.println(letter);
        System.out.println(length);

    }
}
