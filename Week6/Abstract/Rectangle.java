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

class Rectangle extends Shape {
    double dim3;

    Rectangle(double a, double b, double c) {
        super(a, b);
        dim3 = c;
    }

    // override area for rectangle
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2* dim3;
    }
}