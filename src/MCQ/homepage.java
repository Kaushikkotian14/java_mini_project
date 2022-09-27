package MCQ;


import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class homepage extends JFrame implements ActionListener{

    JButton bt1,bt2,bt3,bt4,bt5;
    Font fLabel = new Font("Times New Roman", Font.PLAIN,19);

    homepage() 
    {
        JFrame frame = new JFrame();

        frame.setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        setLayout(null);

        bt1 = new JButton("Login");
        bt1.setBounds(700, 20, 70, 20);
        bt1.addActionListener(this);
        frame.add(bt1);

        bt2 = new JButton("Result");
        bt2.setBounds(50, 20 + 70, 100, 20);
        frame.add(bt2);

        bt3 = new JButton("Rules");
        bt3.setBounds(50, 50 + 70, 100, 20);
        frame.add(bt3);

        bt4 = new JButton("Grivence");
        bt4.setBounds(50, 80 + 70, 100, 20);
        frame.add(bt4);

        bt5 = new JButton("Feedback");
        bt5.setBounds(50, 110 + 70, 100, 20);
        frame.add(bt5);

        JLabel wel = new JLabel("WELCOME");
        wel.setBounds(375, 150 + 70, 800, 40);
        wel.setFont(fLabel);
        frame.add(wel);
        
        JLabel name = new JLabel("App name");
        name.setBounds(375, 20, 800, 40);
        name.setFont(fLabel);
        frame.add(name);

        JLabel logo = new JLabel("LOGO");
        logo.setBounds(50, 20, 40, 40);
        frame.add(logo);

        JLabel details = new JLabel("");
        details.setBounds(375, 270, 800, 100);
        frame.add(details);

        frame.setVisible(true);
    
    }

    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bt1)
        { 
            this.setVisible(false);
            new login();
            
        }
    }

    public static void main(String[] args) {
        new homepage();
    }
}
