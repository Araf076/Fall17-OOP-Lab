package Week4.LogIN;

import java.util.Scanner;

/**
 * Created by abdullah on 10/29/2017.
 */
public class passwordRunner {
    public static void main(String[] args) {
        Login user = new Login("Araf","1234");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Password: ");
        String password = input.nextLine();

        user.changePassword(password);
    }
}
