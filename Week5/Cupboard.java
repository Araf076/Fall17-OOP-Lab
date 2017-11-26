package Week5;

/**
 * Created by lab7pc5 on 11/5/2017.
 */
public class Cupboard {
    double items;

    public Cupboard() {
        this.items = 0;
    }

    public Cupboard(double x) {
        this.items = x;
    }

    void addItems(){
        this.items = this.items + 1;
    }

    void addItems(double x){
        this.items = this.items + x;
    }

    void open(){
        System.out.println("week5.Cupboard open");
    }
}
