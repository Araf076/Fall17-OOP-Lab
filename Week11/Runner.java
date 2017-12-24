package Week11;

import java.io.*;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        String thisLine = null;
        FileReader in = null;
        FileWriter out = null;
        String[] str;

        ArrayList<Integer> cookiesArrayList = new ArrayList<>();
        ArrayList<Integer> balloonsArrayList = new ArrayList<>();

        try {
            in = new FileReader("cb.txt");
            BufferedReader br = new BufferedReader(in);
            BufferedWriter bw = new BufferedWriter(new FileWriter("Total.txt"));

            int guest = 0;
            while ((thisLine = br.readLine()) != null) {
                guest++;
                System.out.println("Guest: " + guest + ", Gifts (Cookies & Balloons): " + thisLine);
                str = thisLine.split(" ");

                int cookies = Integer.parseInt(str[0]);

                if(cookies < 0){
                    throw new WrongGiftException();
                }
                cookiesArrayList.add(cookies);

                int balloons = Integer.parseInt(str[1]);

                if(balloons < 0){
                    throw new WrongGiftException();
                }
                balloonsArrayList.add(balloons);
            }

            int totalCookies = 0;
            for(int i = 0;i<cookiesArrayList.size();i++){
                totalCookies = totalCookies + cookiesArrayList.get(i);
            }

            int totalBalloons = 0;
            for(int i = 0;i<balloonsArrayList.size();i++){
                totalBalloons = totalBalloons + balloonsArrayList.get(i);
            }
            System.out.println("There are " + totalCookies + " cookies and " + totalBalloons +" balloons.");

            bw.write("There are " + totalCookies + " cookies and " + totalBalloons +" balloons.");

            br.close();
            bw.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

class WrongGiftException extends Exception{
    public WrongGiftException() {

    }

    @Override
    public String toString() {
        System.err.println("The input file has errors. Fix input file.");
        return "WrongGiftException{}";
    }
}