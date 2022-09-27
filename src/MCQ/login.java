package MCQ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener {
    JButton back,loginButton,registerButton;

    login()
    {
        JPanel panel=new JPanel();
        JFrame frame=new JFrame();
        // ImageIcon title=new ImageIcon(ClassLoader.getSystemResource("title.png"));
        // Image i3  = title.getImage().getScaledInstance(800,500,Image.SCALE_SMOOTH);
        // ImageIcon i4 = new ImageIcon(i3);
        // JLabel i2 = new JLabel(i4);
        // i2.setBounds(0,0,800,500);
        // panel.add(i2);
        
        frame.setSize(800,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);
        JLabel lable1=new JLabel("USERNAME");
        lable1.setBounds(200,150,80,25);
        panel.add(lable1);

        JTextField txtUser=new JTextField(20);
        txtUser.setBounds(300,150,170,20);
        panel.add(txtUser);
        

        JLabel lable2=new JLabel("PASSWORD");
        lable2.setBounds(200,200,80,25);
        panel.add(lable2);

        JPasswordField txtpass=new JPasswordField();
        txtpass.setBounds(300,200,170,20);
        panel.add(txtpass);

        loginButton=new JButton("LOGIN");
        loginButton.setBounds(200,250,100,20);
        // loginButton.setBackground(Color.BLACK);
        panel.add(loginButton);
        
        back =new JButton("BACK");
        back.setBounds(350,250,100,20);
        panel.add(back);

        JLabel lable3=new JLabel("New User?");
        lable3.setBounds(200,300,100,20);
        panel.add(lable3);


        registerButton=new JButton("REGISTER");
        registerButton.setBounds(280,300,100,20);
        panel.add(registerButton);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==back)
        {
            new homepage();
            this.setVisible(false);
        }
        // if(ae.getSource()==loginButton)
        // {

        // }
    }
    public static void main(String[] args) {
        new login();
    }
    
}
