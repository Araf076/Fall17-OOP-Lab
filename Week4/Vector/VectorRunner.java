package Week4.Vector;

import java.util.Scanner;

/**
 * Created by abdullah on 10/29/2017.
 */
public class VectorRunner {
    public static void main(String[] args) {

        // Problem 3 implementation of main
        double x, y, z;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter Values of X & Y for Vector2D:");
        x = myScanner.nextInt();
        y = myScanner.nextInt();
        Vector2D vector2D_1 = new Vector2D(x,y);

        System.out.println("Enter Values of X, Y & Z for Vector3D:");
        x = myScanner.nextInt();
        y = myScanner.nextInt();
        z = myScanner.nextInt();
        Vector3D vector3D_1 = new Vector3D(x, y, z);

        System.out.println("");
        System.out.println("Vector2D,");
        vector2D_1.show();
        vector2D_1.normalize();
        vector2D_1.show();

        System.out.println("");
        System.out.println("Vector3D,");
        vector3D_1.show();
        vector3D_1.normalize();
        vector3D_1.show();

        // Problem 4 implementation of main
        System.out.println("");
        System.out.println("Enter Value of the integer to multiply the vector:");
        int a = myScanner.nextInt();
        System.out.println("Product by passing an int,");
        System.out.println("V = " + vector2D_1.product(a));
        System.out.println("");

        System.out.println("Enter Values of X & Y for the new 2D Vector you want to pass:");
        x = myScanner.nextInt();
        y = myScanner.nextInt();
        Vector2D new2dVector = new Vector2D(x,y);
        System.out.println("");
        System.out.println("Product by passing an object of Vector2D,");
        System.out.println("Dot Product of the vectors: " + vector2D_1.product(new2dVector));

    }
}
