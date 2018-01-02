package Week10.CollectionsAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by abdullah on 12/17/17.
 */
public class Problem1 {
    public static void main(String[] args) {
        ArrayList<IntNumbers> number = new ArrayList<IntNumbers>();

        for(int i=0;i<=1000;i++){
            Scanner scanner = new Scanner(System.in);
            int temp = scanner.nextInt();
            if(temp == 0)
                break;

            else if(temp >= 10E4){
                System.out.println("Please enter input below 10^5 only");
            }

            else{
                IntNumbers tempNumber = new IntNumbers(temp,2);
                number.add(tempNumber);
            }
        }

        Collections.sort(number);

        for(IntNumbers item: number) {
            System.out.print(item);
            System.out.print(" ");
        }
    }
}

class IntNumbers implements Comparable<IntNumbers>{
    int actualNumber, divisorCount;

    public IntNumbers(int actualNumber, int divisorCount) {
        this.actualNumber = actualNumber;
        this.divisorCount = divisorCount;
    }

    int divisorCountMethod (int actualNumber){
        int temp = 2;
    //    System.out.println("Number Entered in divmethd " + actualNumber + " " + divisorCount);
        for(int i=2;i<actualNumber; i++){
            if(actualNumber % i == 0){
                temp ++;
            }
        }
        divisorCount = temp;

        if(actualNumber == 1){
            divisorCount = 1;
        }

    //    System.out.println("Number Exited divmethd " + actualNumber + " " + divisorCount);
        return divisorCount;
    }

    public int compareTo(IntNumbers o) {
        return divisorCountMethod(this.actualNumber) - divisorCountMethod(o.actualNumber);
    }

    public String toString(){
        return actualNumber + "";
    }
}

//Sample inputs
//        5
//        16
//        3
//        44
//        35
//        1
//        1000000
//        0