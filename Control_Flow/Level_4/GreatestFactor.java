package Level_4;

import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("No proper factors exist.");
            return;
        }

        int greatestFactor = 1;
        for (int i = n / 2; i >= 1; i--) {
            if (n % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest factor of " + n + " (excluding itself) is: " + greatestFactor);
    }
}

