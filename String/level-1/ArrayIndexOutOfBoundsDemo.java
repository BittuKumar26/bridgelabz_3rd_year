/*
8.Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint => 
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

 */

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo { 
    public static void generateException(String[] names) { 
        System.out.println("Accessing invalid index: " + names[names.length]);
    } 
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[names.length]);
        } 
        catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Message: " + e.getMessage());
        } 
        catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        } 
        try {
            generateException(names); // throws exception
        } 
        catch (Exception e) {
            System.out.println("Exception occurred in generateException(): " + e);
        } 
        handleException(names); // safely handled
    }
}
