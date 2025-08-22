/*
8. Create a program to convert distance in kilometers to miles.
Hint => 
a. Create a variable km and assign type as double as in double km;
b. Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
c. Use Scanner Object to take user input for km as in km = input.nextInt();
d. Use 1 mile = 1.6 km formulae to calculate miles and show the output
I/P => km
O/P => The total miles is ___ mile for the given ___ km      */


package level1;
import java.util.Scanner;
public class Converdistinkm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double km=sc.nextDouble();
        double miles=1.6*km;
        System.out.print("The total miles is " + miles + " mile for the given km "+ km);
    }  
}
