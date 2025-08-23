/*
4. Write a program FizzBuzz, take a number as user input, and check for a positive integer.
If positive integer, loop and print the number, but for multiples of 3 print "Fizz" instead of the number, 
for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
Hint => 
Take the user input number, check for a positive integer, and use for loop to display       */

 
package Level_3;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                    break;
                } 
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                    break;
                } 
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                    break;
                } 
                else {
                    System.out.println();
                }
            }
        } 
        else {
            System.out.println("Invalid input! Please enter a positive integer.");
        }
    }
}

