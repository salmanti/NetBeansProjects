
package w3;

import java.util.ArrayList;




public class email {
    public static void main(String[] args) {
        ArrayList<String> intArr=new ArrayList<>();
        intArr.add(" abc@gmail.com");
        intArr.add(" aaa@gmail.com");
        intArr.add(" aja@gmail.com");
        intArr.add(" ajah@gmail.com");
        intArr.add(" ahagl@gmail.com");
        intArr.add(" llja@gmail.com");
        intArr.add(" nabv@gmailcom");
        
        
      
       for (int i = 0; i <  intArr.size(); i++) {
           if ( intArr.get(i).contains("@")&&  intArr.get(i).contains(".")){
                System.out.println("True "+ intArr.get(i));
           }else{
                System.out.println("False "+ intArr.get(i));
            }            
       }
 



   
        
    }
    
}
