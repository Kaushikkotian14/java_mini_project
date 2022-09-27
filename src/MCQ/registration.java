package MCQ;
import java.awt.*;
import java.awt.event.*;
import java.sql.Statement;

import javax.swing.*;
import java.text.*;
// import com.toedter.calendar.JDateChooser;

public class registration extends JFrame implements ActionListener  {
    JTextField Fname,Lname,age,contact,gender,address,aadhar,email,dob,clg;
  registration() {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    Font enter1 = new Font ("Copper Black",Font.PLAIN,30);

    Font  fLabel = new Font("times new roman",Font.BOLD,20);
    JRadioButton male,female;

    frame.setSize(1600, 900);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);
    panel.setLayout(null);

    //labelsize
    int lX=600;
    int lW=200;
    int lH=50;

    // Textsize    
    int txtX=800;
    int txtW=100;
    int txtH=40;

    // Labels & textfields
    JLabel l1 = new JLabel("Enter Details");
    l1.setBounds(700, 125, 250, 50);
    l1.setFont(enter1);
    panel.add(l1);

    JLabel l2 = new JLabel("First Name");
    l2.setBounds(lX, 200, lW, lH);
    l2.setFont(fLabel);
    panel.add(l2);
    Fname = new JTextField();
    Fname.setBounds(txtX, 200, txtW, txtH);
    panel.add(Fname);

    // JLabel l3 = new JLabel("Middle Name");
    // l3.setBounds(lX, 200, lW, lH);
    // l3.setFont(fLabel);
    // panel.add(l3);
    // JTextField mnameTxt = new JTextField();
    // mnameTxt.setBounds(txtX, 200, txtW, txtH);
    // panel.add(mnameTxt);

    JLabel l4 = new JLabel("Last Name");
    l4.setBounds(lX, 250, lW, lH);
    l4.setFont(fLabel);
    panel.add(l4);
    Lname = new JTextField();
    Lname.setBounds(txtX, 250, txtW, txtH);
    panel.add(Lname);


    JLabel l5 = new JLabel("E-mail");
    l5.setBounds(lX, 300, lW, lH);
    l5.setFont(fLabel);
    panel.add(l5);
    email=new JTextField();
    email.setBounds(txtX,300,txtW,txtH);
    panel.add(email);

    JLabel l6 = new JLabel("Date of Birth");
    l6.setBounds(lX, 350, lW, lH);
    l6.setFont(fLabel);
    panel.add(l6);
    dob=new JTextField();
    dob.setBounds(txtX,350,txtW,txtH);
    panel.add(dob);
    JLabel format=new JLabel("(DD/MM/YYYY)");
    format.setBounds(900,350,txtW,txtH);
    // format.setFont(fLabel);
    panel.add(format);

    JLabel l7 = new JLabel("College");
    l7.setBounds(lX, 400, lW, lH);
    l7.setFont(fLabel);
    panel.add(l7);
    clg=new JTextField();
    clg.setBounds(txtX,400,txtW,txtH);
    panel.add(clg);

    JLabel l8 = new JLabel("Gender");
    l8.setBounds(lX, 450, lW, lH);
    l8.setFont(fLabel);
    panel.add(l8);
    // JTextField genderTxt=new JTextField();
    // genderTxt.setBounds(txtX,550,txtW,txtH);
    // panel.add(genderTxt);

    JLabel l9 = new JLabel("Aadhar No.");
    l9.setBounds(lX, 500, lW, lH);
    l9.setFont(fLabel);
    panel.add(l9);
    aadhar=new JTextField();
    aadhar.setBounds(txtX,500,txtW,txtH);
    panel.add(aadhar);

    JLabel l10 = new JLabel("Contact");
    l10.setBounds(lX, 550, lW, lH);
    l10.setFont(fLabel);
    panel.add(l10);
    contact=new JTextField();
    contact.setBounds(txtX,550,txtW,txtH);
    panel.add(contact);

    // JLabel l11 = new JLabel("Male");
    // l11.setBounds(lX, 550, lW, lH);
    // l11.setFont(fLabel);
    // panel.add(l11);
    // JRadioButton male=new JRadioButton();
    // male.setBounds(txtX,550,txtW,txtH);
    // panel.add(male);

    // JLabel l12 = new JLabel("Female");
    // l12.setBounds(lX, 550, lW, lH);
    // l12.setFont(fLabel);
    // panel.add(l12);
    // JRadioButton female=new JRadioButton();
    // female.setBounds(txtX,550,txtW,txtH);
    // panel.add(female);

    

    JButton submit = new  JButton("SUBMIT");
    submit.setBounds(700,600,120,50);
    panel.add(submit);
    setLayout(null);
    setVisible(true);
    


    setLocationRelativeTo(null);
    frame.setVisible(true);
  }
   
  public void actionPerformed(ActionEvent ae)
  {
   conn c=new conn();
   String Fname = this.Fname.getText();
   String Lname =this.Lname.getText();
   String email= this.email.getText();
   String dob = this.dob.getText();
   String clg = this.clg.getText();
   String gender = this.gender.getText();
   String aadhar = this.aadhar.getText();
   String contact = this.contact.getText();

   String gender = null;
   try{
    Statement s;
    s =c.c.createStatement();
    String str = "insert into candidate_reg() values();";
    s.executeUpdate(str);
    // JOptionPane.showMessageDialogue(null,"REGISTRATION IS SUCCESSFULL!!");
   }
   catch(Exception e){
    System.out.println(e);
   }
   
  }

  public static void main(String[] args) {
    new registration();
  }
}
