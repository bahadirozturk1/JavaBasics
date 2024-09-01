package login;

import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel1 = new JLabel("Hello!");

    WelcomePage(String userID) {

        welcomeLabel1.setBounds(0, 0, 200, 35);
        welcomeLabel1.setFont(new Font(null, Font.PLAIN, 25));
        welcomeLabel1.setText("Welcome " + userID);

        frame.add(welcomeLabel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
