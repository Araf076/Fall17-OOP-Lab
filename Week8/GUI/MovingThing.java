/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week8.GUI;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.*;
/**
 *
 * @author Rubaba Hasan
 */
public class MovingThing extends JPanel implements ActionListener{
    Timer t = new Timer(1, this);
    double x=0, y=0, velx=2, vely=2;
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D circle = new Ellipse2D.Double(x, y, 40, 40);
        g2.fill(circle);
        t.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x<0 || x>540)
        {
            velx = -velx;
        }
        if(y<0 || y > 320){
            vely = -vely;
        }
        x+=velx;
        y+=vely;
        repaint();
    }
    
}

class Main{
    public static void main(String[] args) {
        MovingThing mt = new MovingThing();
        JFrame mainframe = new JFrame();
        mainframe.add(mt);
        mainframe.setVisible(true);
        
        mainframe.setSize(600, 400);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setTitle("Moving");
        
    }
}