package Week11;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by abdullah on 12/26/17.
 */
public class Gift implements Serializable{
    String GiftName;
    String Message;
    boolean canEat;
    static ArrayList<Gift> giftsArrayList = new ArrayList<>();


    public Gift(String giftName, String message, boolean canEat) {
        GiftName = giftName;
        Message = message;
        this.canEat = canEat;
    }

    public static void main(String[] args) {

        Gift gift1 = new Gift("Cake","Delicious!", true);
        Gift gift2 = new Gift("Laptop","Strictly for Study Purposes", false);
        Gift gift3 = new Gift("Chocolate","Dairy Milk", true);

        giftsArrayList.add(gift1);
        giftsArrayList.add(gift2);
        giftsArrayList.add(gift3);

        writeGift();

        readGift();
    }

    static void writeGift(){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/Week11/gifts.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for (Gift gift: giftsArrayList) {
                objectOutputStream.writeObject(gift);
            }

            objectOutputStream.flush();
            objectOutputStream.close();
            System.out.println("Serialization Successful!");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void readGift(){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/Week11/gifts.ser"));

            System.out.println("\nAfter Deserialization:");
            for(int i=0;i<giftsArrayList.size();i++){
                Gift gift = (Gift) objectInputStream.readObject();
                System.out.println("Gift Name: " + gift.GiftName + ", Message: " + gift.Message + ", Can Eat?: " + gift.canEat);
            }

              //prints null afterwards
//            int count = 0;
//            while ( ( gift = (Gift) objectInputStream.readObject() ) != null) {
//                count++;
//                System.out.println(count);
//                System.out.println("Gift Name: " + gift.GiftName + ", Message: " + gift.Message + ", Can Eat?: " + gift.canEat);
//            }

              //prints only one object
//            Gift gift = (Gift) objectInputStream.readObject();
//            System.out.println("Gift Name: " + gift.GiftName + ", Message " + gift.Message + ", Can Eat? " + gift.canEat);

            objectInputStream.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}