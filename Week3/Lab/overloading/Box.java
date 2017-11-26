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
public class Box {
    double length;
    double width;
    double height;
    Box()
    {
        length = 0;
        width = 0;
        height = 0;
    }
    Box(double a)
    {
        length = a;
        width = a;
        height = a;
    }
    Box(double length, double width, double height){
        this.length = length; 
        this.width = width;
        this.height = height;
    }
    Box(Box a)
    {
        length = a.length;
        width = a.width;
        height = a.height;
    }
    double volume()
    {
        double vol = length * width * height;
        System.out.println("Volume = " + vol);
        return vol;
    }
    Box returnClone(Box a)
    {
        Box temp;
        temp = new Box(a);
        return temp;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
