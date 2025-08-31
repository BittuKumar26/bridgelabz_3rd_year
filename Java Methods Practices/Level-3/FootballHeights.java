import java.util.Arrays;
import java.util.Random;

public class FootballHeights { 
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int h : arr) sum += h;
        return sum;
    } 
    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    } 
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min) min = h;
        }
        return min;
    } 
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] heights = new int[11]; 
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;  
        } 
        System.out.println("Players Heights: " + Arrays.toString(heights));
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + findMean(heights) + " cm");
    }
}
