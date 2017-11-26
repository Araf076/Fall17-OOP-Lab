package Week2.Online.ArraySort;

import java.util.Scanner;

/**
 * Created by abdullah on 10/21/17.
 */
public class ArraySort {
    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Enter Length for First Array: ");
        int array1Length = numberScanner.nextInt();
        int array1[]= new int[array1Length];

        System.out.println("Enter Length for Second Array: ");
        int array2Length = numberScanner.nextInt();
        int array2[]= new int[array2Length];

        int sortedArrayLength = array1Length + array2Length;
        int sortedArray[]= new int[sortedArrayLength];

        System.out.println("Enter Values for First Array: ");
        for(int i=0; i < array1Length; i++){
            array1[i] = numberScanner.nextInt();
        }

        System.out.println("Enter Values for Second Array: ");
        for(int i=0; i < array2Length; i++){
            array2[i] = numberScanner.nextInt();
        }

        for(int i=0, j=0, k = 0; k < sortedArrayLength; k++){
            if (i == array1Length){
                sortedArray[k] = array2[j];
                j++;
            }

            else if (j == array2Length){
                sortedArray[k] = array1[i];
                i++;
            }

            else if (array1[i] >= array2[j]){
                sortedArray[k] = array2[j];
                j++;
            }

            else if (array1[i] < array2[j]){
                sortedArray[k] = array1[i];
                i++;
            }
        }

        System.out.println("First Array: ");
        for(int i=0; i < array1Length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println("");

        System.out.println("Second Array: ");
        for(int i=0; i < array2Length; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println("");

        System.out.println("Combined Sorted Array: ");
        for(int i=0; i < sortedArrayLength; i++){
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println("");
    }
}