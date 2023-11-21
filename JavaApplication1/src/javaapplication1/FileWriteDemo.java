
package javaapplication1;


public class FileWriteDemo {
    public static void main(String[] args) {
        try {
             BufferWriter writer = new BufferWriter(new fileWriter("Output.txt"));
             writer.write("asdflds");
             writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
      
    }
    
}
