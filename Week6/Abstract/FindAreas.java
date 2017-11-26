/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6.Abstract;

/**
 *
 * @author Rubaba Hasan
 */

class FindAreas {
  public final static void main(String args[]) {
    //Shape f = new Shape(10, 10);
    Rectangle r = new Rectangle(9, 5, 2);
    Triangle t = new Triangle(10, 8);
    
    Shape s;
 
    s = r;
    System.out.println(" r Area is " + s.area());
    
    s = t;
    System.out.println(" t Area is " + s.area());
    
    System.out.println(s);
    
   // s = f;
   // System.out.println(" f Area is " + s.area());
  }
}
