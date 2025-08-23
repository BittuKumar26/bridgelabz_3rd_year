/*
3. Create a program to find the multiplication table of a number entered by the user from 6 to 9.
Hint => 
Take integer input and store it in the variable number
Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___  */

  
package Level_3;

import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Table(n,1);
    }
    public  static void Table(int n,int start){
        if(start==11){
            return;
        }
        System.out.println(n+" x "+start+" = "+n*start);
        Table(n,start+1);
    } 
}
