/*
3. Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
Hint => 
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray() 
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result

 */

import java.util.Scanner;

public class CustomToCharArray { 
    public static char[] myToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    } 
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String text = sc.next(); 
        char[] customArray = myToCharArray(text); 
        char[] builtinArray = text.toCharArray(); 
        boolean isEqual = compareCharArrays(customArray, builtinArray); 
        for (char c : customArray) {
            System.out.print(c + " ");
        } 
        for (char c : builtinArray) {
            System.out.print(c + " ");
        }
        System.out.println("\n\nAre both arrays equal? " + isEqual);
    }
}
