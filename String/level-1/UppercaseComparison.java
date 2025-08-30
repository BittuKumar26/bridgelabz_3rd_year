/*
9. Write a program to convert the complete text to uppercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the uppercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the uppercase text and compare the two strings using the user-defined method. And finally display the result

 */

import java.util.Scanner;
public class UppercaseComparison { 
    public static String manualToUpperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); 
            if (ch >= 'a' && ch <= 'z') { 
                result.append((char)(ch - 32));
            } 
            else {
                result.append(ch); 
            }
        }
        return result.toString();
    } 
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String text = sc.nextLine(); 
        String builtInUpper = text.toUpperCase(); 
        String manualUpper = manualToUpperCase(text); 
        boolean isEqual = compareStrings(builtInUpper, manualUpper); 
        System.out.println("\nOriginal Text: " + text);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Manual Uppercase: " + manualUpper);
        System.out.println("Comparison Result: " + (isEqual ? "Both are same ✅" : "They are different ❌"));
    }
}
