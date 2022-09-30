package HACK;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class login extends JFrame implements ActionListener {


    JButton Bk;
    JButton Lb;

    login() {
        //ImageIcon title=new ImageIcon(ClassLoader.getSystemResource("title.png"));
        //image i3  = title.getImage().getScaledInstance(800,500,image.SCALE_SMOOTH);
        //ImageIcon i4 = new ImageIcon(i3);
        //JLabel i2 = new JLabel(i4);
        //i2.setBounds(0,0,800,500);
        //panel.add(i2);
        JFrame frame = new JFrame();
        frame.setSize(800, 500);
        this.setDefaultCloseOperation(3);
        this.setLayout((LayoutManager) null);

        frame.setSize(1500, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);

        panel = new JPanel();
        panel.setLayout(null);
        JLabel lable1 = new JLabel("USERNAME");
        lable1.setBounds(300, 250, 80, 25);
        panel.add(lable1);

        JTextField txtUser = new JTextField(20);
        txtUser.setBounds(400, 250, 170, 20);
        panel.add(txtUser);


        JLabel lable2 = new JLabel("PASSWORD");
        lable2.setBounds(300, 300, 80, 25);
        panel.add(lable2);

        JPasswordField txtpass = new JPasswordField();
        txtpass.setBounds(400, 300, 170, 20);
        panel.add(txtpass);

        JButton Lb = new JButton("LOGIN");
        Lb.setBounds(350, 350, 100, 20);
        this.Lb.addActionListener(this);
        panel.add(Lb);

        JButton Bk = new JButton("BACK");
        Bk.setBounds(500, 350, 100, 20);
        this.Bk.addActionListener(this);
        frame.add(this.Bk);

        panel.add(Bk);

        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new login() {
            @Override
            public void actionPerformed() {

            }

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };


    }

    public void actionPerformed() {

    }

    public void actionPerformed(ActionEvent aa) {

    }
}







