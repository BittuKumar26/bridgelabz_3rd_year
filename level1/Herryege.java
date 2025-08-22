
/* 
1. Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
 I/P => NONE
 O/P => Harry's age in 2024 is ___    */

 
package level1;
import java.util.*;
public class Herryege {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int born=sc.nextInt();
        int curr_year=sc.nextInt();
        int actual_age=curr_year-born;
        System.out.println("Harry's age in 2024 is:" + actual_age);
    }   
}
