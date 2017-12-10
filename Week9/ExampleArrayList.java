package Week9;
import java.util.ArrayList;

/**
 * Created by lab7pc5 on 12/10/2017.
 */
public class ExampleArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        System.out.println("Size: " +arrayList.size());
        arrayList.add("CookieMonster");
        System.out.println("Size: " +arrayList.size());

        arrayList.add("CerealKiller");
        arrayList.add("BroccoliFearer");

        System.out.println("Size: " +arrayList.size());
        //calls toString method in class ArrayList
        System.out.println(arrayList);

        for (int i = 0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        arrayList.add(2, "FatMonster");
        System.out.println(arrayList);

        arrayList.set(2, "ThinMonster");

        System.out.println("Index of CookieMonster " + arrayList.indexOf("CookieMonster"));

        arrayList.remove("CookieMonster");
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);

        System.out.println("The Arraylist is empty = true or false?" + arrayList.isEmpty());
    }
}
