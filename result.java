package HACK;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;


public class result extends JFrame
{
    result ()
    {
        JFrame j=new JFrame();
        JLabel lable=new JLabel();
        JButton button=new JButton();


        Border bdr= BorderFactory.createLineBorder(Color.black,3);  //Border to window
        lable.setBorder(bdr);
        j.setSize(1550,800);//Window size
        j.setTitle("Hack O'Holic");//Name

        ImageIcon img=new ImageIcon("logo.png");//logo change
        j.setIconImage(img.getImage());
        //j.getContentPane().setBackground(new Color(123,50,250));//change BG

        lable.setText("RESULTS");//Text
        lable.setForeground(new Color(123,50,250));//font colour change
        lable.setFont(new Font("Tahoma", Font.BOLD, 30));
        //lable.setBackground(Color.BLACK);
        lable.setOpaque(true);

        //aligliment
        lable.setVerticalAlignment(JLabel.TOP);
        lable.setHorizontalAlignment(JLabel.CENTER);

        //button
        button.setBounds(200,100,100,50);
        button.setVisible(true);
        add(button);
        // lable.setBounds(0,0,250,250);
        // j.setLayout(null);
        j.add(lable);
        j.setResizable(false);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit code on closing window
        j.setVisible(true);


    }




    public static void main (String args[])
    {
        new result();
    }

    public void actionPerformed() {

    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    public void actionPerformed(ActionEvent e) {

    }
}
