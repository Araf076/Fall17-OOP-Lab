package Week3.Practice.Phone;

/**
 * Created by abdullah on 10/29/17.
 */
public class PhoneV1 extends Phone {
    boolean hasCamera;

    PhoneV1(){

    }

    PhoneV1(double dimension, String color, boolean canCall, boolean hasCamera){
        super(dimension, color, canCall);
        this.hasCamera = hasCamera;
    }

    void show (){
        System.out.println("Class: PhoneV1");
        System.out.println("Dimension: " + dimension);
        System.out.println("Color: " + color);
        System.out.println("Can Call? " + canCall);
        System.out.println("Has Camera? " + hasCamera);
    }
}
