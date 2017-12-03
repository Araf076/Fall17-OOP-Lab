/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week8.GUI;

import javax.swing.*;

/**
 *
 * @author Rubaba Hasan
 */
public class SimpleFrame {

    public SimpleFrame() {
        JFrame frameObject = new JFrame();
        frameObject.setTitle("My Application");
        frameObject.setSize(400, 400);
        frameObject.setLocation(100, 100);
        frameObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameObject.setVisible(true);
    }
    public static void main(String[] args) {
        new SimpleFrame();
    }
    
}
