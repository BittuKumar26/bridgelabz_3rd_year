/*
2. Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___    */

 
package level1;
import java.util.*;
public class Sammarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int maths=sc.nextInt();
        int phy=sc.nextInt();
        int chem=sc.nextInt();
        int avg=(maths+phy+chem)/3;
        System.out.println("Sam's average mark in PCM is: "+ avg);
    } 
}
