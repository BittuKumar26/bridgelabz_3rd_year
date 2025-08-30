/*
1. Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method 
Hint => Take user input using the  Scanner next() method for 2 String variables.
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result . */

import java.util.Scanner;
public class Compare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if (str1.equals(str2)) {
            System.out.print(true);
        } 
        else {
            System.out.print(false);
        }
    }
}

 