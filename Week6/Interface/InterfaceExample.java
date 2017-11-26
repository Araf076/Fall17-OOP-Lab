/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6.Interface;

/**
 *
 * @author Rubaba Hasan
 */
interface IFexample{
    //int var;
    void meth();
    int anotherMeth();
    default void defMeth(){
        System.out.println("Default");
    }
}

class A implements IFexample{
    public void meth(){
        System.out.println("Overrides meth in A");
    }
    public int anotherMeth(){
        System.out.println("Overrides aotherMeth in A");
        return 0;
    }
}

abstract class IncompleteA implements IFexample{
    public void meth(){
        System.out.println("Overrides meth in IncompleteA");
    }
}

class Example{
    public static void main(String[] args) {
        A objA = new A();
    }
}