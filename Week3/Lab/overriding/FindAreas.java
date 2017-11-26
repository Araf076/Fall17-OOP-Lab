/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3.Lab.overriding;

/**
 *
 * @author Rubaba Hasan
 */

class FindAreas {
  public static void main(String args[]) {
    Figure f = new Figure(10, 10);
    Rectangle r = new Rectangle(9, 5);
    Triangle t = new Triangle(10, 8);
    
    Figure figref;

    figref = r;
    System.out.println("Area is " + figref.area());
    //System.out.println(figref.color);  //can't access this because it isnt declared in figure class

    figref = t;
    System.out.println("Area is " + figref.area());
    
    figref = f;
    System.out.println("Area is " + figref.area());
  }
}
