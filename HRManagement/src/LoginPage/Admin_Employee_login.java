package LoginPage;

import com.managementhr.loginPrompt;
import com.managementhr.loginPromptEmployee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin_Employee_login implements ActionListener {
    ImageIcon image = new ImageIcon("HLogo.png");

    JButton admin = new JButton("Admin Login");
    JButton Employee = new JButton("Employee Login");

    JFrame frame = new JFrame("HR MANAGEMENT ");
    public Admin_Employee_login()
    {
        // ----------------JLable ---------------------------
        JLabel label = new JLabel("HR Management Software");
        label.setBounds(120,0,400,150);
        label.setFont(new Font(null,Font.BOLD,30));
        label.setForeground(Color.BLACK);
        label.setIcon(image);
        // ----------------JLabel ---------------------------

        // ----------------Buttons ---------------------------
        admin.addActionListener(this);
        admin.setBounds(220,220,200,50);
        Employee.setBounds(220,380,200,50);
        admin.setFocusable(false);
        Employee.setFocusable(false);
        admin.setFont(new Font("Comic Sans", Font.BOLD,18));
        Employee.setFont(new Font("Comic Sans", Font.BOLD,18));
        admin.setForeground(Color.BLACK);
        Employee.setForeground(Color.BLACK);
        admin.setBackground(Color.LIGHT_GRAY);
        Employee.setBackground(Color.LIGHT_GRAY);
        Employee.addActionListener(this);
        // ----------------Buttons ---------------------------

        // ----------------Frames---------------------------

        frame.setSize(600,600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.add(admin);
        frame.add(Employee);
        frame.add(label);

        // ----------------Frames ---------------------------
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == admin) {
            new loginPrompt();
            frame.dispose();
        }

        if (e.getSource() == Employee) {
            new loginPromptEmployee();
            frame.dispose();
        }
    }

    public void paint(Graphics g)
    {
        g.drawLine(220,20,400,80);
    }
}