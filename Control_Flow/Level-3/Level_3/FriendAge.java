/*
6. Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it      */

 

package Level_3;

import java.util.Scanner;

public class FriendAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int age=sc.nextInt();
        // int ht=sc.nextInt();
        int amar=sc.nextInt();
        int amarh=sc.nextInt();
        int akbar=sc.nextInt();
        int akbarh=sc.nextInt();
        int anthony=sc.nextInt();
        int anthonyh=sc.nextInt();
        if(amar<akbar &&amar<anthony){
            System.out.println(amar +"is youngest");


        }
        else if(akbar<amar && akbar<anthony){
            System.out.println(akbar+"is youngest");
        }
        else{
            System.out.println(anthony+" is youngest");
        }
        if(amarh>akbarh &&amarh>anthonyh){
            System.out.println(amarh +"is tallest friend ");


        }
        else if(akbarh>amarh && akbarh>anthonyh){
            System.out.println(akbarh +" is tallest friend");
        }
        else{
            System.out.println(anthonyh +" is tallest friend");
        }






 


    }
    
}
