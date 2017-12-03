/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week8.GUI;

import javax.swing.JFrame;

/**
 *
 * @author Rubaba Hasan
 */
public class SimpleFrameTwo extends JFrame{

    public SimpleFrameTwo() {
        super("My Application");
        setSize(400, 400);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleFrameTwo();
    }
    
}
