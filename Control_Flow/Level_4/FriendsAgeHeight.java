package Level_4;
import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ages
        System.out.print("Enter age of Amar: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int anthonyAge = sc.nextInt();

        // Heights
        System.out.print("Enter height of Amar: ");
        int amarHeight = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int akbarHeight = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int anthonyHeight = sc.nextInt();

        // Youngest
        if (amarAge < akbarAge && amarAge < anthonyAge)
            System.out.println("Amar is youngest.");
        else if (akbarAge < amarAge && akbarAge < anthonyAge)
            System.out.println("Akbar is youngest.");
        else
            System.out.println("Anthony is youngest.");

        // Tallest
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight)
            System.out.println("Amar is tallest.");
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight)
            System.out.println("Akbar is tallest.");
        else
            System.out.println("Anthony is tallest.");
    }
}
