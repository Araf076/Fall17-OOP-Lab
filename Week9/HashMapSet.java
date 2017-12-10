package Week9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by lab7pc5 on 12/10/2017.
 */
public class HashMapSet {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("A");

        System.out.println("ArrayList " + arrayList);

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.addAll(arrayList);
        //HashSet considers same values as 1 single value, and displays only unique values
        System.out.println("HashSet " + hashSet);

        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.addAll(hashSet);
        System.out.println("ArrayList2 " + arrayList2);

        HashMap <Integer, Student> hashMap = new HashMap<Integer, Student>();
        Student student1 = new Student("Joy", 22);
        Student student2 = new Student("Araf", 21);

        Student def = new Student("No Student", 0);

        hashMap.put(071, student1);
        hashMap.put(076, student2);

        System.out.println("76 is " + hashMap.get(076));
        System.out.println("85 is " + hashMap.getOrDefault(85,def));

       // System.out.println(hashMap);
    }
}