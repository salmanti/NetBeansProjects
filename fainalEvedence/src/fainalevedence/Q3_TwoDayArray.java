
package fainalevedence;


public class Q3_TwoDayArray {
    public static void main(String[] args) {
        Integer[][]arrays={
            {8,6,5,3},
            {5,6,8,5},
            {7,8,5,6,},
   };
        
        multyArraySum(arrays);
        multyArrayPrint(arrays);
    }

    public static void multyArraySum(Integer[][] arrays) {
       int totalSum=0;
        for (int i = 0; i < arrays.length; i++) {
           int sum=0;
            for (int j = 0; j < arrays[i].length; j++) {
            sum += arrays[i][j];
                
            }
            totalSum+=sum;
            System.out.println("Total sum :"+totalSum );
            
        }
    }

  public static void multyArrayPrint(Integer[][] arrays) {
      for (int i = 0; i < arrays.length; i++) {
          System.out.println("");
          for (int j = 0; j < arrays[i].length; j++) {
              System.out.print(arrays[i][j]+", ");
              
          }
          
      }
      System.out.println("");
       
    }
    
}
