package Week6.Online.Abstract;

/**
 * Created by lab7pc5 on 11/12/2017.
 */
public class main {
    public static void main(String[] args) {

        // No objects can be created for Abstract class
        // WritingTool writingTool = new WritingTool();
        // WritingTool.write();

        Pen pen1 = new Pen();
        pen1.write();

        Pencil pencil1 = new Pencil();
        pencil1.write();
    }
}
