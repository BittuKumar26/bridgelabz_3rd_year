/*
 5. Write a program to demonstrate StringIndexOutOfBoundsException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

 */

import java.util.Scanner;

public class StringIndexDemo { 
    public static void generateException(String text) { 
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    } 
    public static void handleException(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String input = sc.next(); 
        try {
            generateException(input);  
        } 
        catch (Exception e) {
            System.out.println("Exception occurred in generateException(): " + e);
        } 
        handleException(input);   
    }
}
