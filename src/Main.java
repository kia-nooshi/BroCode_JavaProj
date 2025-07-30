import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        //.substring() = a method used to extract a portion of a string
        //               .substring(start, end)


        //String email = "test123@gmail.com";
        //String username = email.substring(0,7);
        //String domain = email.substring(8, 17);
        //can also do email.substring(8) which is only the starting domain and it will
        //can use .indexOf() method to find the index value of a character to use as beginning or end
        //String username = email.substring(0, email.indexOf("@"));
        //String domain = email.substring(email.indexOf("@") +1 );

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if (email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Your username is: " + username);
            System.out.println("Your domain is: " + domain);

        } else {
            System.out.println("Emails must contain an @");
        }

        scanner.close();

    }
}
