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
 abstract class Shape {
  double dim1;
  double dim2; 
  

  Shape(double a, double b) {
    dim1 = a;
    dim2 = b;
  }

  /*double area(){
      return 0;
  }*/
  abstract double area();

 // public String toString() {
  //    return "dim 1: " + dim1 + " dim 2: " + dim2;
   // }
}

