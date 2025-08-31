import java.util.Scanner;

public class ChocolatesDivision{
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int chocolatesPerChild = number / divisor;
        int remainingChocolates = number % divisor;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int numberOfChocolates = sc.nextInt(); 
        int numberOfChildren = sc.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Each child gets = " + result[0] + " chocolates");
        System.out.println("Remaining chocolates = " + result[1]);
    }
}
