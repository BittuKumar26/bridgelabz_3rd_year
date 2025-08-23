package Level_4;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (m): ");
        int m = sc.nextInt();

        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= m;
        }

        System.out.println(m + "^" + n + " = " + result);
    }
}
