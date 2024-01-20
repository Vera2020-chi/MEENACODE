import java.util.Scanner;
public class Project {
    public static void main(String[] args){
        Scanner myNum = new Scanner(System.in);
        System.out.println("Enter a number");
        int userNum = myNum.nextInt();
        if ( userNum % 2 == 0){
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");

        }

    }
}
