package Week10.CollectionsAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by abdullah on 12/18/17.
 */
public class Problem2 {
    public static void main(String[] args) {
        ArrayList<Criminal> criminalArrayList = new ArrayList<Criminal>();

        ArrayList<String> crimeArrayList = new ArrayList<>();
        HashSet<String> crimeHashSet = new HashSet<>();

        ArrayList<Integer> cellNoArrayList = new ArrayList<>();
        HashSet<Integer> cellNoHashSet = new HashSet<>();

        boolean c = true;
        while (c = true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            if (id < 0){
                System.out.println("");
                System.out.println("Invalid ID");
                System.out.println("");
                break;
            }
            if(id < 1 || id > 10E8) {
                System.out.println("Enter ID between 1 and 10^9 kindly.");
                id = scanner.nextInt();
            }

            System.out.print("Enter Name: ");
            String name = scanner.next();

            System.out.print("Enter Crime: ");
            String crime  = scanner.next();
            crimeArrayList.add(crime);

            System.out.print("Enter Prison Cell No: ");
            int prisonCellNo = scanner.nextInt();
            if(prisonCellNo < 1 || prisonCellNo > 10E8) {
                System.out.println("Enter Prison Cell No between 1 and 10^9 kindly.");
                prisonCellNo = scanner.nextInt();
            }
            cellNoArrayList.add(prisonCellNo);

            System.out.print("Enter Jail Sentence Duration: ");
            int jailSentenceDuration = scanner.nextInt();
            if(jailSentenceDuration < 1 || jailSentenceDuration > 10E8) {
                System.out.println("Enter Jail Sentence Duration between 1 and 10^9 kindly.");
                jailSentenceDuration = scanner.nextInt();
            }

            Criminal criminal = new Criminal(id, name, crime, prisonCellNo, jailSentenceDuration);
            criminalArrayList.add(criminal);
        }

        Collections.sort(criminalArrayList);


        System.out.println("Query a:");
        for(Criminal item: criminalArrayList) {
            System.out.println("Name: " + item.name + " ID: " + item.id);
        }


        System.out.println("Query b:");
        crimeHashSet.addAll(crimeArrayList);
        for(String item: crimeHashSet) {
            System.out.println("Crime: " + item + " Criminals: " + Collections.frequency(crimeArrayList, item));
        }


        System.out.println("Query c:");
        cellNoHashSet.addAll(cellNoArrayList);
        for(Integer item: cellNoHashSet) {
            System.out.println("Prison Cell: " + item + " Inmates: " + Collections.frequency(cellNoArrayList, item));
        }


        System.out.println("Query d:");
        for(Integer item: cellNoHashSet) {
            System.out.print("Prison Cell: " + item + " Inmates: " );
            for(int i= 0; i<criminalArrayList.size(); i++){
                if(item == criminalArrayList.get(i).prisonCellNo){
                    System.out.print(criminalArrayList.get(i).name + " ");
                }
            }
            System.out.println();
        }
    }
}

class Criminal implements Comparable<Criminal>{
    int id;
    String name;
    String crime;
    int prisonCellNo;
    int jailSentenceDuration;

    public Criminal(int id, String name, String crime, int prisonCellNo, int jailSentenceDuration) {
        this.id = id;
        this.name = name;
        this.crime = crime;
        this.prisonCellNo = prisonCellNo;
        this.jailSentenceDuration = jailSentenceDuration;
    }

    @Override
    public int compareTo(Criminal o) {
        return this.jailSentenceDuration - o.jailSentenceDuration;
    }
}