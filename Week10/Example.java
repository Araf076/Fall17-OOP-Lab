package Week10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

/**
 * Created by Dell on 12/18/2017.
 */
public class Example {
    public static void main(String[] args) {
        String thisLine = null;
        FileReader in = null;
        FileWriter out = null;
        String[] str;
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        try {
            // open input stream test.txt for reading purpose.
            in = new FileReader("Week10/input.txt");
            BufferedReader br = new BufferedReader(in);
            BufferedWriter bw = new BufferedWriter(new FileWriter("Week10/output2.txt"));

            int i=1;
            while ((thisLine = br.readLine()) != null) {
                System.out.println(i + ". " + thisLine);
                str = thisLine.split(" ");
                if(hm.get(str[0]) != null) {
                    hm.put(str[0], (hm.get(str[0]) + Integer.parseInt(str[1])));
                }else{
                    hm.put(str[0], Integer.parseInt(str[1]));
                }
            }
            System.out.println(hm);
            br.close();
            bw.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
