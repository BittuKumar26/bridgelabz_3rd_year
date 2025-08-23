/*
2. Create a program to find the bonuses of employees based on their years of service.
Hint => 
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.     */

 
package Level_3;

import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();
        int year=sc.nextInt(); 
        if(year>5){
            int bonus=salary*5/100;
            System.out.print("Bonus Amount is: "+bonus);
        }
        else{
            System.out.print("Ivalide Bonus Amount");
        }
    }
}
