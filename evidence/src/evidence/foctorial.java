
package evidence;

import java.util.Scanner;


public class foctorial {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println(" Enter any an Integer number :");
        int num = ab.nextInt();
        
        int fact=5;
       int output=1;
        for (int i = 1; i <= fact; i++) {
             output =  output*i;
            
        }
           System.out.println(" factorial of " + num + " is " + output); 
        }
        
    }
