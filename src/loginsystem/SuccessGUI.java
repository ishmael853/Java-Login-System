package loginsystem;

import javax.swing.*;
import java.awt.*;

public class SuccessGUI extends JFrame {

    public SuccessGUI(String username) {

        setTitle("Login Successful");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel message = new JLabel(
                "You have logged in successfully!",
                SwingConstants.CENTER
        );

        JLabel user = new JLabel(
                "Welcome, " + username + "!",
                SwingConstants.CENTER
        );

        message.setFont(
                new Font("Arial", Font.BOLD, 24)
        );

        user.setFont(
                new Font("Arial", Font.PLAIN, 18)
        );

        panel.add(message, BorderLayout.CENTER);
        panel.add(user, BorderLayout.SOUTH);

        add(panel);
    }
}
