package Week3.Practice.Phone;

/**
 * Created by abdullah on 10/29/17.
 */
public class PhoneV2 extends PhoneV1 {
    boolean hasInternet;
    double dataUsed = 0;
    double unitCost = 0;

    PhoneV2(double dimension, String color, boolean canCall, boolean hasCamera,
            boolean hasInternet, double dataUsed, double unitCost){
        super(dimension, color, canCall, hasCamera);
        this.hasInternet = hasInternet;
        this.dataUsed = dataUsed;
        this.unitCost = unitCost;
    }

    public PhoneV2() {

    }

    void useInternet (int data){
        dataUsed = dataUsed + data;
    }

    double calculateBill(){
        return dataUsed * unitCost;
    }

    double calculateBill(int previousBill){
        return (dataUsed * unitCost) + previousBill;
    }

    void show (){
        System.out.println("Class: PhoneV2");
        System.out.println("Dimension: " + dimension);
        System.out.println("Color: " + color);
        System.out.println("Can Call? " + canCall);
        System.out.println("Has Camera? " + hasCamera);
        System.out.println("Has Internet? " + hasInternet);
        System.out.println("Data Used Amount: " + dataUsed);
        System.out.println("Unit Cost: " + unitCost);
    }
}
