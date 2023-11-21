
package fainalevedence;


public class Q7_twoDayArraySorting {
    public static void main(String[] args) {
        Integer[][]arrays={
            {5,2,3,7,6},
            {6,8,3,4,2},
            {5,6,3,7,8,2},

        };
        multyArraySort(arrays);
        
    }

    private static void multyArraySort(Integer[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            Integer[]arr=arrays[i];
            for (int j = 0; j < arrays[i].length; j++) {
                for (int k = 0; k < arrays[i].length; k++) {
                    int m=0;
                    if(arrays[i][j]>arrays[i][k]){
                    m=arrays[i][k];
                    }
                    
                }
                System.out.print(arrays[i][j] +" ");
                
            }
            System.out.println("");
        }
    }
    
}
