package abeerfilereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AbeerFileReader {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("F:\\abeer.txt");
            int data = reader.read();
            while (data != -1) {

                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }

    }

}
