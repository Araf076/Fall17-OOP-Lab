package Week4.Vector;

/**
 * Created by abdullah on 10/29/2017.
 */
public class Vector3D extends Vector2D{
    double z;

    Vector3D(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }

    double normX, normY, normZ;
    boolean normalized = false;

    @Override
    void normalize() {
        p = Math.sqrt(x * x + y * y + z * z);
        normX = x/p;
        normY = y/p;
        normZ = z/p;
        normalized = true;
    }

    void show(){
        if(normalized) {
            System.out.println("P = " + p);
            System.out.print("After Normalizing, V = ");
            System.out.println(normX + "i + " + normY + "j + " + normZ + "k");
        }
        else {
            System.out.print("V = ");
            System.out.println(x + "i + " + y + "j + " + z + "k");
        }
    }
}