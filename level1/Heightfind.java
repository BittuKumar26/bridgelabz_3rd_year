/*
10. Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___*/

 
package level1;
import java.util.Scanner;
public class Heightfind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ht=sc.nextInt();
        double inches=ht/2.54;    //int inches=(int)(ht/2.54);
        double feet=inches/12;
        System.out.println("Your Height in cm is "+ ht +" while in feet is "+ feet+ " and inches is "+ inches);
    }
}
