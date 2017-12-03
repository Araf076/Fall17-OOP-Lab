/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week8.GUI;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Rubaba Hasan
 */
public class MainScreen extends JFrame{
    JTextField textField;
    JTextArea textArea;
    JButton button;
    public MainScreen(){
        setSize(400, 400);
        setLayout(new FlowLayout());
        
        textArea = new JTextArea();
        textField = new JTextField("Text here", 20);
        button = new JButton();
        button.setText("Click");
        
        add(textArea);
        add(textField);
        add(button);
    }
    public static void main(String[] args) {
        MainScreen mainS = new MainScreen();
        mainS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainS.setVisible(true);
    }
}
