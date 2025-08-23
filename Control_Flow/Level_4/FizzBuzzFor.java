package Level_4;

import java.util.Scanner;

public class FizzBuzzFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a positive integer.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print("FizzBuzz ");
            else if (i % 3 == 0)
                System.out.print("Fizz ");
            else if (i % 5 == 0)
                System.out.print("Buzz ");
            else
                System.out.print(i + " ");
        }
    }
}

