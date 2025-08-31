import java.util.Scanner;

public class FriendsInfo { 
    public static String findYoungest(String[] names, int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return names[minIndex];
    } 
    public static String findTallest(String[] names, int[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return names[maxIndex];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height (in cm) of " + friends[i] + ": ");
            heights[i] = sc.nextInt();
        }

        String youngest = findYoungest(friends, ages);
        String tallest = findTallest(friends, heights);

        System.out.println("The youngest friend is: " + youngest);
        System.out.
        println("The tallest friend is: " + tallest);

        sc.close();
    }
}
