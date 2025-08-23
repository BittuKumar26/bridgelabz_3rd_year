/*
12. Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___ */
 

package level1;

import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int ht=sc.nextInt();
        double area=0.5*base*ht;
        double areainches=area/(2.54*2.54);   
        System.out.println("Your Height in cm is "+ ht + " area of triangle in inches  " + areainches);
        sc.close();
    } 
}
