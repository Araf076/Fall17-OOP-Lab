package Week5;

import java.util.Scanner;

/**
 * Created by lab7pc5 on 11/5/2017.
 */
public class RoomOfRequirement extends Cupboard {
    private String password;

    RoomOfRequirement(){
        super();
        this.password = "1234";
    }

    RoomOfRequirement(String password) {
        super();
        this.password = password;
    }

    RoomOfRequirement(double x, String password) {
        super(x);
        this.password = password;
    }

    void open(){
        System.out.println("Enter Password: ");
        Scanner myScanner = new Scanner(System.in);

        if (this.password.equals(myScanner.nextLine())){
            System.out.println("Open room of requirement");
        }
        else
            System.out.println("There is no room of requirement");
    }
}
