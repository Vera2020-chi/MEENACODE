package com.magadistudio.errorHandlingProject;
public class ErrorHandling {
    public static void main(String [] args){

        float sum = 0;
        for (String argument : args){
            sum = sum + Float.parseFloat(argument);
        }
        System.out.println("Sum is:" + sum);
    }

}
