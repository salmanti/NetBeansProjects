
package evidence;

import java.util.Scanner;


public class prime {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any number : ");;
        int num=sc.nextInt();
        boolean isPrime= true;
        for (int i = 2; i <=num/2; i++) {
            System.out.println(i);
            
            if (num%i==0) {
                isPrime=false;
                break;
                
            }
            
        }
        if (isPrime) {
            System.out.println( num + " is prime");
            
        }else{
            System.out.println(num+ " is not prime");
        }
        
    }
    
}
