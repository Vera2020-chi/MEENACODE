import java.util.Scanner;
public class Username {
    public static void main (String[]args){
        Scanner myName = new Scanner (System.in);
        System.out.println ("Enter username");

        String username = myName.nextLine ();
        System.out.println ("Your username is " + username);

        Scanner myAge = new Scanner (System.in);
        System.out.println ("Enter age");

        int userAge = myName.nextInt ();
        System.out.println ("Your user age is " + userAge);

        System.out.println ("Your name is " + username + " and your age is " + userAge);
    }
}
