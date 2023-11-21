
package evidence;

import java.util.Scanner;


public class conditionlsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum=0;
        System.out.println("Enter numbers to calculate the conditional sum : ");
        while(true){
        
        int input= sc.nextInt();
            if (input == -1) {
                break;
              
            }
              sum +=input;
        }
        System.out.println(" conditional sum :" + sum);
    }
    
}
