/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abeerfilewrite;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author B-12
 */
class FileWrite {
    
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("SalmanKhan.txt");
            writer.write("       _.---._    /\\\\\n" +
"    ./'       \"--`\\//\n" +
"  ./              o \\          .-----.\n" +
" /./\\  )______   \\__ \\        ( help! )\n" +
"./  / /\\ \\   | \\ \\  \\ \\       /`-----'\n" +
"   / /  \\ \\  | |\\ \\  \\7--- ooo ooo ooo ooo ooo ooo");
         
            writer.close();;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
    }
}
