package Week8.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloApp {
    private JTextField enterNameTextField;
    private JButton myButtonButton;
    private JPanel panel1;

    public HelloApp() {

        myButtonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = enterNameTextField.getText();
                JOptionPane.showMessageDialog(null, name);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame1 = new JFrame("Frame");
        HelloApp p = new HelloApp();
  //      p.panel1.setSize(100, 100);
        frame1.setContentPane(p.panel1);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(50,50);
        frame1.pack();
        frame1.setVisible(true);
    }
}
