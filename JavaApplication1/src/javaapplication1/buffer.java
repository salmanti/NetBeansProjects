package javaapplication1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class buffer {

    public static void main(String[] args) throws IOException {
//     buffer.writeFile();
        buffer.readFile();
    }

    ;
    
    
   public static void writeFile() throws IOException {
        BufferedWriter bf = new BufferedWriter(new FileWriter("abc.txt"));
        BufferedWriter bf2 = new BufferedWriter(new FileWriter("mdsalu.jpg"));
        bf.write("I love u sofir vai");
        bf.write(" \nmy name is md salman rahman");
        bf.write("\nI read in Ibd ");

        bf.close();

    }

    public static void readFile() throws IOException {
        BufferedReader bf1 = new BufferedReader(new FileReader("abc.txt"));
        
//        BufferedWriter bf2 = new BufferedWriter(new FileWriter("mdsalu.jpg"));
        
//        String line = bf1.readLine();
//        System.out.println(line);
//
//        bf1.close();

String line;
while ((line = bf1.readLine()) != null){
    System.out.println(line);
};
         

        bf1.close();


    }
}
