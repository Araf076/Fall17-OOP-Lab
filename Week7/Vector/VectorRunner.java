package Week7.Vector;

/**
 * Created by lab7pc5 on 11/26/2017.
 */
public class VectorRunner {
    public static void main(String[] args) {
        Vector2D vector1 = new Vector2D(2,4);
        Vector2D vector2 = new Vector2D(3,6);

        vector1.add();
        vector2.subtract();

        System.out.println(vector1.add(vector1, vector2));
        System.out.println(vector1.subtract(vector1, vector2));

        System.out.println(vector2.add(vector2, vector1));
        System.out.println(vector2.subtract(vector2, vector1));
    }
}
