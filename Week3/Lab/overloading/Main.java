/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3.Lab.overloading;

/**
 *
 * @author Rubaba Hasan
 */
public class Main {
    public static void main(String[] args)
    {
        Box mybox, myCube, specificBox, clone;
        mybox = new Box();
        mybox.volume();
        myCube = new Box(10);
        myCube.volume();
        specificBox = new Box(2, 3 , 4);
        specificBox.volume();
        clone = mybox.returnClone(myCube);
        clone.volume();

        OverloadDemo ov = new  OverloadDemo();
        System.out.println("Calling with no parameter");
        ov.test();
        System.out.println("Calling with one parameter");        
        ov.test(10.5);
        System.out.println("Calling with String");
        ov.test("Hello World");
    }
}

class OverloadDemo{
    void test(){
        System.out.println("No parameter method");
    }
    void test(int a)
    {
        System.out.println("One parameter, int a = " + a);
    }
    void test(int a, int b)
    {
        System.out.println("Two parameters. a = " + a + " b = " + b);
    }
    double test(double b)
    {
        System.out.println("One parameter, double a = " + b);
        return b;
    }
    void test(String a)
    {
        System.out.println("The string is: " + a);
    }
}