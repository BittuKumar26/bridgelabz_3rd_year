/*
5. Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
Hint => 
a. Use Modulus Operator (%) to find the reminder.
b. Use Division Operator to find the Quantity of pens
I/P => NONE
O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___    */

 
package level1;
// import java.util.*;
public class Penditributed {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int pen=14;
        int stud=3;
        int equally=14/3;
        int remaining=14%3;
        System.out.println("The Pen Per Student is "+ equally + " and the remaining pen not distributed is " + remaining);
    }   
}
