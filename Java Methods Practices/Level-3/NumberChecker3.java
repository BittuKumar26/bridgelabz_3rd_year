import java.util.Arrays;

class NumberChecker { 
    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    } 
    public static int[] getDigits(int num) {
        String s = String.valueOf(Math.abs(num));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    } 
    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i];
        }
        return rev;
    } 
    public static boolean compareArrays(int[] a, int[] b) {
        return Arrays.equals(a, b);
    } 
    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        int[] rev = reverseArray(digits);
        return compareArrays(digits, rev);
    } 
    public static boolean isDuck(int num) {
        String s = String.valueOf(Math.abs(num));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0') return true;
        }
        return false;
    }
}

public class NumberChecker3 {
    public static void main(String[] args) {
        int num = 1221;  
        System.out.println("Number: " + num);
        System.out.println("Count of digits: " + NumberChecker.countDigits(num));
        int[] digits = NumberChecker.getDigits(num);
        System.out.println("Digits array: " + Arrays.toString(digits));
        int[] rev = NumberChecker.reverseArray(digits);
        System.out.println("Reversed array: " + Arrays.toString(rev));
        System.out.println("Arrays equal? " + NumberChecker.compareArrays(digits, rev));
        System.out.println("Is Palindrome? " + NumberChecker.isPalindrome(num));
        System.out.println("Is Duck number? " + NumberChecker.isDuck(num));
    }
}
