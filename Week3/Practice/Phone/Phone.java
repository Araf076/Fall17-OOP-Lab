package Week3.Practice.Phone;

/**
 * Created by abdullah on 10/29/17.
 */
public class Phone {
    double dimension;
    String color;
    boolean canCall;

    Phone(){

    }

    Phone(double dimension, String color){
        this.canCall = true;
    }

    Phone(double dimension, String color, boolean canCall){
        this.dimension = dimension;
        this.color = color;
        this.canCall = canCall;
    }

    void show (){
        System.out.println("Class: Phone");
        System.out.println("Dimension: " + dimension);
        System.out.println("Color: " + color);
        System.out.println("canCall: " + canCall);
    }
}
