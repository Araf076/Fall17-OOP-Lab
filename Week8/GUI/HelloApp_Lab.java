package Week8.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by lab7pc5 on 12/3/2017.
 */
public class HelloApp_Lab {
    private JTextField name;
    private JButton ClickButton;
    private JPanel panel1;

    public HelloApp_Lab() {
        ClickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String n = name.getText();

                 JOptionPane.showMessageDialog(null, n);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame1 = new JFrame("Main Frame");
        HelloApp_Lab app = new HelloApp_Lab();
        frame1.setContentPane(app.panel1);

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.pack();

        frame1.setVisible(true);
    }
}