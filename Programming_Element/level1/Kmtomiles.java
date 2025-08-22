/*
3. Create a program to convert the distance of 10.8 kilometers to miles.
Hint: 1 km = 1.6 miles
I/P => NONE   
O/P => The distance  ___ km in miles is ___      */


package level1;
import java.util.*;

public class Kmtomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter distance in kilometers: ");
        int km = sc.nextInt(); 
        double miles = 0.6* km; 
        System.out.println("The distance " + km + " km in miles is: " + miles);
        sc.close();
    }
}