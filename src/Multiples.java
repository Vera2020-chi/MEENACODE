public class Multiples {
    public static void main(String [] args){
        // using for loop to create multiplication table from 1-12
        System.out.println("My muliplication Table");
        for(int i = 1;i<=12;i++){
            //i should not exceed 12
            for(int j = 1; j<=12; j++){
                //j should not exceed 12
                System.out.println(i +"*" + j + "=" + i*j );
            }
        }
    }
}