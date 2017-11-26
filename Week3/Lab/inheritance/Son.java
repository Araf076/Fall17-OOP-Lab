/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3.Lab.inheritance;

/**
 *
 * @author Rubaba Hasan
 */
public class Son extends Father{
    public double business;
    //public double land;

    public Son(double business, String secretLetter, double land, String heirloom) {
        //calling the constructor in super class with received parameters
        //
        super(secretLetter, land, heirloom);
        this.land = 25;
        this.business = business;
    }

    public void show(){
        System.out.println("Business worth " + business + "tk and inherited land of " + land + " amount");
        System.out.println("Heirloom received " + heirloom);
        //System.out.println("Father's secret letter says " + secretLetter);
        System.out.println("Son's Land " + land + " and father's land " + super.land);
    }
}
