package Week4.FindingAverage;

import Week3.Lab.inheritance.Son;

import java.util.Scanner;

/**
 * Created by abdullah on 10/29/2017.
 */
public class overloadingRunner {
    public static void main(String[] args) {
        double number1;
        double number2;
        double number3;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Numbers ");
        number1 = myScanner.nextDouble();
        number2 = myScanner.nextDouble();
        number3 = myScanner.nextDouble();

        System.out.println("Enter length of Array: ");
        int arrayLength = myScanner.nextInt();
        double array[] = new double[arrayLength];
        System.out.println("Enter Values of Array: ");
        for(int i=0;i<arrayLength;i++){
            array[i]= myScanner.nextDouble();
        }

        System.out.println("Average of two numbers: " + average(number1,number2));
        System.out.println("Average of three numbers: " + average(number1,number2,number3));
        System.out.println("Average of Array: " + average(array));
    }


    static double average(double number1, double number2){
        return (number1+number2)/2;
    }

    static double average(double number1, double number2, double number3){
        return (number1 + number2 + number3) / 3;
    }

    static double average(double array[]){
        double sum = 0;
        for(int i =0; i<array.length; i++){
            sum = array[i] + sum;
        }
        return sum / array.length;
    }
}