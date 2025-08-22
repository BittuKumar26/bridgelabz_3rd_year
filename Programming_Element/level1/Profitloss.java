/*
4.  Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
Hint => 
a. Use a single print statement to display multiline text and variables.
b. Profit = selling price - cost price
c. Profit Percentage = profit / cost price * 100
I/P => NONE
O/P => 
The Cost Price is INR ___ and Selling Price is INR ___
The Profit is INR ___ and the Profit Percentage is ___       */


package level1;
import java.util.*;
public class Profitloss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the cost price : ");
        int cp=sc.nextInt();
        System.out.print("Enter the Selling price : ");
        int sp=sc.nextInt();
        int profit=sp-cp;
        double prof_Per=profit*100/cp;
        System.out.print("The Cost Price is INR "+ cp + " and Selling Price is INR "+ sp + "\n"+ "The Profit is INR "+ profit +" and the Profit Percentage is "+ prof_Per);
    }
}
