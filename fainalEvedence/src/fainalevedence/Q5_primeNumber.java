
package fainalevedence;

import java.util.Scanner;


public class Q5_primeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Positive Integer :");
        int num= sc.nextInt();
        int count=0;
        
        if(!(num<2)){
            for (int i = 2; i < num; i++) {
                if(num%i==0){
                count++;
                break;
                }
                
            }

        }else{
        count++;
        }
        if(count==0){
            System.out.println("The number "+num+" is a prime number");
        }else{
            System.out.println("The number "+num+" is not a prime number");
        }
    
}
}
