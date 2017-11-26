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
public class InheritenceRunner {
    public static void main(String[] args)
    {
        Father f = new Father("Hello Hitler", 20.5, "Gold locket");
        Son s = new Son(40000, "My beloved", 50, "Diamond ring");
        s.show();
        //System.out.println(f.secretLetter);
        System.out.println("Heirloom received " + f.heirloom);
        
    }
}
