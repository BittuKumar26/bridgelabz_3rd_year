import java.util.Scanner;

class NumberChecker4 { 
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    } 
    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    } 
    public static boolean isSpy(int n) {
        int sum = 0, prod = 1, temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            prod *= d;
            temp /= 10;
        }
        return sum == prod;
    } 
    public static boolean isAutomorphic(int n) {
        int square = n * n;
        return String.valueOf(square).endsWith(String.valueOf(n));
    } 
    public static boolean isBuzz(int n) {
        return (n % 7 == 0 || n % 10 == 7);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt();

        System.out.println(num + " is Prime? " + isPrime(num));
        System.out.println(num + " is Neon? " + isNeon(num));
        System.out.println(num + " is Spy? " + isSpy(num));
        System.out.println(num + " is Automorphic? " + isAutomorphic(num));
        System.out.println(num + " is Buzz? " + isBuzz(num));
    }
}
