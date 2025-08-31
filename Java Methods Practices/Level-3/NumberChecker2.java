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
    public static int sumDigits(int num) {
        int[] digits = getDigits(num);
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    } 
    public static int sumSquares(int num) {
        int[] digits = getDigits(num);
        int sum = 0;
        for (int d : digits) sum += (int) Math.pow(d, 2);
        return sum;
    } 
    public static boolean isHarshad(int num) {
        int sum = sumDigits(num);
        return sum != 0 && num % sum == 0;
    } 
    public static int[][] digitFrequency(int num) {
        int[] digits = getDigits(num);
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
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
 