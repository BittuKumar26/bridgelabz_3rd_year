/*
13. Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____ */
 

package level1;

import java.util.*;

public class Perimeterofsqr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sides=sc.nextInt();
        int perimeter=4*sides;
        System.out.println("The length of the side is "+ sides +" whose perimeter is " + perimeter);
    }
}

