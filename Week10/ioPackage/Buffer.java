/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week10.ioPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Rubaba Hasan
 */
public class Buffer {
   
   public static void main(String[] args) throws Exception {
      String thisLine = null;
      FileReader in = null;
      FileWriter out = null; 
      
      try {
      
         // open input stream test.txt for reading purpose.
         in = new FileReader("input2.txt");
         BufferedReader br = new BufferedReader(in);
         BufferedWriter bw = new BufferedWriter(new FileWriter("output2.txt"));
         
         int i=1;
         while ((thisLine = br.readLine()) != null) {
            System.out.println(i + ". " + thisLine);
            bw.write(i + ". " + thisLine);
            i++;
         }       
         br.close();
          bw.close();
      } catch(Exception e) {
         e.printStackTrace();
      }
      
   }
}

