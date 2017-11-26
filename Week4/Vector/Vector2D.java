package Week4.Vector;

/**
 * Created by abdullah on 10/29/2017.
 */

public class Vector2D {
    double x, y;

    double normX, normY, p;
    boolean normalized = false;

    Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void normalize(){
        /*there really is no need to show the value of p in the show method.
        it is a variable used to make our calculation easier.
        so, it might be better to declare and initialize it WITHIN this method.*/
        p = Math.sqrt(x*x + y*y);
        normX = x/p;
        normY = y/p;
        normalized = true;
    }

    /*
    while your implementation is correct, another way might be this:
	Vector2D  normalize(){
		double p = Math.sqrt(x*x + y*y);
		Vector2D temp = new Vector2D(x/p, y/p);
		return temp;
	}
	*/

    void show(){

        //checking if it is normalized or in other words if normalized == true
        if(normalized) {
            System.out.println("P = " + p);
            System.out.print("After Normalizing, V = ");
            System.out.println(normX + "i + " + normY + "j");
        }
        else {
            System.out.print("V =  ");
            System.out.println(x + "i + " + y + "j");
        }
    }

    //problem 4 codes

    String product(int a){
        System.out.println("Value of the vectors' X: " + x + " & Y: " + y + ", & multiplying it by " + a + ",");
        return a*x + "i + " + a*y + "j";
    }

    double product(Vector2D v){
        System.out.println("Value of received vectors' X: " + v.x + " & Y: " + v.y);
        System.out.println("Value of primary vectors' X: " + x + " & Y: " + y);
        //Formula: a dot product b = a1*b1 + a2*b2
        return (v.x * this.x) + (this.y * v.y);
    }
}