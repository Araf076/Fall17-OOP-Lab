package Week6.Online.Interface;

/**
 * Created by lab7pc5 on 11/12/2017.
 */
public class ArrayStack implements MyStack{
    int array[] = new int[5];
    int pointedIndex;

    ArrayStack(){
        pointedIndex = 0;
    }

    public void push(int x){
        if(pointedIndex != array.length - 1) {
            array[pointedIndex] = x;
            pointedIndex ++;
            System.out.println("Added Value: " +x);
        }
        else
            System.out.println("No Space Available!!!");
    }

    public int pop(){
        if(pointedIndex > 0) {
            pointedIndex --;
            return array[pointedIndex];
        }
        else{
            System.out.println("No more value to pop");
            return 0;
        }
    }
}