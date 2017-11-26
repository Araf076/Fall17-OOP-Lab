package Week4.LogIN;

import java.util.Scanner;

/**
 * Created by abdullah on 10/29/2017.
 */
public class Login {
    String username;
    private String password;

    Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    Scanner input = new Scanner(System.in);

    boolean changePassword(String pass){
        if(this.password.equals(pass)){
            System.out.println("Enter New Password: ");
            this.password = input.nextLine();
            System.out.println("Password changed successfully!");
            return true;
        }
        else
            System.out.println("Wrong Password!");
            return false;
    }
}
