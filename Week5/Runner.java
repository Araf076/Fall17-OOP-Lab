package Week5;

/**
 * Created by lab7pc5 on 11/5/2017.
 */
public class Runner {
    public static void main(String[] args) {
        Cupboard c = new Cupboard(5);
        c.open();
        c.addItems();
        CupboardNarnia n = new CupboardNarnia();
        RoomOfRequirement r = new RoomOfRequirement();
        n.addItems(3);
        r.addItems(100);
        Cupboard ref = n;
        ref.open();
        ref = r;
        ref.open();
    }
}
