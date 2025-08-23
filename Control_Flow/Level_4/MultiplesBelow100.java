import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a positive integer.");
            return;
        }

        System.out.print("Multiples of " + n + " below 100 are: ");
        for (int i = n; i < 100; i += n) {
            System.out.print(i + " ");
        }
    }
}
