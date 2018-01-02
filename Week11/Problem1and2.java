package Week11;

import java.io.*;
import java.util.ArrayList;

public class Problem1and2 {
    public static void main(String[] args) {
        String thisLine = null;
        FileReader in = null;
        FileWriter out = null;
        String[] str;

        ArrayList<Integer> cookiesArrayList = new ArrayList<>();
        ArrayList<Integer> balloonsArrayList = new ArrayList<>();

        try {
            in = new FileReader("src/Week11/cb.txt");
            BufferedReader br = new BufferedReader(in);
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/Week11/Total.txt"));

            int guest = 0;
            while ((thisLine = br.readLine()) != null) {
                guest++;
                str = thisLine.split(" ");
                System.out.println("Guest: " + guest + ", Cookies: " + str[0] + ", Balloons: " + str[1]);

                int cookies = Integer.parseInt(str[0]);
                if(cookies >= 0){
                    cookiesArrayList.add(cookies);
                }
                else {
                    throw new WrongGiftException();
                }

                int balloons = Integer.parseInt(str[1]);
                if(balloons >= 0){
                    balloonsArrayList.add(balloons);
                }
                else {
                    throw new WrongGiftException();
                }
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
    @Override
    public String toString() {
        return "WrongGiftException: The input file has errors. Fix input file.";
    }
}