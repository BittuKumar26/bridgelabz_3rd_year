/*
14. Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___ */



/* 
package level1;

import java.util.Scanner;

public class Distanceinfeet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int distanceInFeet=sc.nextInt();
        double htincm= distanceInFeet * 30.48;   // height in cm= feet*30.48
        int inches =distanceInFeet*12;
        System.out.println("You Height in cm is  "+htincm+" while in feet is "+distanceInFeet+" and inches is "+ inches);
    } 
}

*/
// package level1;

import java.util.Scanner;

public class Distanceinfeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        int distInFeet = sc.nextInt(); 
        float yards = distInFeet / 3;
        // Convert to miles (1 mile = 1760 yards)
        float miles = yards / 1760; 
        System.out.println("The distance of " + distInFeet + " feet is equal to "+ yards +" yards and "+ miles + " miles.");
    }
}