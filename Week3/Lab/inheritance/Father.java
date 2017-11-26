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
public class Father {
    private String secretLetter;
    double land;
    protected String heirloom;
    
    public Father(String secretLetter, double land, String heirloom) {
        this.secretLetter = secretLetter;
        this.land = land;
        this.heirloom = heirloom;
    }
}
