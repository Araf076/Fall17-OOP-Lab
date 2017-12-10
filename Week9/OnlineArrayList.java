package Week9;
import java.util.ArrayList;
/**
 * Created by lab7pc5 on 12/10/2017.
 */
public class OnlineArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("A");
        System.out.println(arrayList);

        for(int i=0; i<arrayList.size(); i++){
            if(arrayList.get(i).equals("A")){
                arrayList.set(i, "B");
            }
        }

        System.out.println(arrayList);
    }
}
