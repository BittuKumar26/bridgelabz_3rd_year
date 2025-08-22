/*
15. Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___  */
 

package level1;

import java.util.Scanner;

public class Pricequantity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        int quantity=sc.nextInt();
        int purchedprice=price*quantity;
        System.out.println("The total purchase price is INR " + purchedprice + " if the quantity "+ quantity + " and unit price is INR " + price);
    } 
}
