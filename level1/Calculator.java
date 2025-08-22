/*
11. Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number 2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___ */

 
package level1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float num1=sc.nextFloat();
        float num2=sc.nextFloat();
        float add=num1+num2;
        float sub=num1-num2;
        float mult=num1*num2;
        float div=num1/num2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
        + num1 + " and " + num2 + " is " + add + ", " + sub + ", " + mult + " and " + div);
    }    
}
