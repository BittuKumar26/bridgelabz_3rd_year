/*
16. Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.     */


package level1;

import java.util.Scanner;

public class Handshake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int handshake=(n*(n-1))/2;
        System.out.println("Number of possible handshakes " + handshake);
    }    
}
