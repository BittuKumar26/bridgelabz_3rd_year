/*
5. Rewrite the program 4 FizzBuzz using the while loop   */


package Level_3;

import java.util.Scanner;

public class FizzBuzzUsingWhile {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
            while(n>0) {
                if (n % 3 == 0 && n % 5 == 0) {
                    System.out.println("FizzBuzz");
                    break;
                } 
                else if (n % 3 == 0) {
                    System.out.println("Fizz");
                    break;
                } 
                else if (n % 5 == 0) {
                    System.out.println("Buzz");
                    break;
                } 
                else {
                    System.out.println();
                }
            }
        }
    }

         

    
