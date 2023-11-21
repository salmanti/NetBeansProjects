package iofile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterrrr {

    public static void main(String[] args) {
        try {
            ABE(); 
        } catch (Exception e) {
        }
        
       
    }

    public static void ABE() throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\xvb.txt"));
        {

            bw.write("md salman rhamankjhbu   uyg yug u7gtgy tguyyghu tyguyyguigh");
            bw.close();

        }

    }

}
