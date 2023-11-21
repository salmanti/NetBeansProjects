
package fainalevedence;

import java.util.Scanner;


public class Q8_largestNumber {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        double num3=sc.nextDouble();
        
       double max = getMax(getMax(num1, num2), num3);
       double min =getMin(getMin(num1,num2),num3);;
        
        System.out.println("The lowest number is:"+min);
        System.out.println("the highest number is :"+max);
        getMax(5,9);
    }
    
}
