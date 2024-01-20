import java.util.Scanner;
public class Number {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = sc.nextInt();
          long fact = 1;
        int i = 1;
        while (i <= num){
            fact *=i;
        i++;
        }
        System.out.println(num + "!= " + fact);








        //System.out.println("1. Add \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Remainder");
        //System.out.print("Choose operator: ");
        //int operator = sc.nextInt();

    }
        }

