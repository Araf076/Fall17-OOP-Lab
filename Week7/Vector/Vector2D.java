package Week7.Vector;

/**
 * Created by lab7pc5 on 11/26/2017.
 */
public class Vector2D implements Vector{
    int x;
    int y;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void add(){
        System.out.println("overridden method of interface");
    }

    public String add(Vector2D v1, Vector2D v2){
        x = v1.x + v2.x;
        y = v1.y + v2.y;
        return x + " l + " + y + " j";
    }

    public void subtract(){
        System.out.println("overridden method of interface");
    }

    public String subtract(Vector2D v1, Vector2D v2){
        x = v1.x - v2.x;
        y = v1.y - v2.y;
        return x + " l + " + y + " j";
    }

}

interface Vector{
    void add();
    void subtract();
}
