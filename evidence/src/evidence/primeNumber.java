
package evidence;

import java.util.Scanner;


public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive integer ");
        
        int num= sc.nextInt();
        int count=0;
        if (!(num<2)) {
            for (int i = 2; i < num; i++) {
                if(num% i==0){
                count++;
                break;
                }
                
            }
     
            
        }
    }
    
}
