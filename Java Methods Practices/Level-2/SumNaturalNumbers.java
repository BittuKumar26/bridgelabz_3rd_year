import java.util.Scanner;

public class SumNaturalNumbers { 
    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    } 
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (>0).");
        } 
        else {
            int sumRec = recursiveSum(n);
            int sumFormula = formulaSum(n);

            System.out.println("Sum using recursion: " + sumRec);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumRec == sumFormula) {
                System.out.println("Both results are same ✅");
            } 
            else {
                System.out.println("Results mismatch ❌");
            }
        } 
    }
}
