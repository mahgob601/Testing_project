import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class registerScreen {
    registerScreen(){
        JFrame window=new JFrame("Register Window");
        window.setSize(500,400);
        window.setLayout(null);
        window.getContentPane().setBackground(Color.decode("#6cb4e4"));
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton rgstrBtn= new JButton("Register");
        rgstrBtn.setBounds(300,300,90,40);
        rgstrBtn.setBackground(Color.decode("#c5d8e1"));
        rgstrBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.dispose();
                new mainScreen();
            }
        });
        window.add(rgstrBtn);

        JButton backBtn= new JButton("Back");
        backBtn.setBounds(100,300,90,40);
        backBtn.setBackground(Color.decode("#c5d8e1"));
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.dispose();
                new loginScreen();
            }
        });
        window.add(backBtn);

        JLabel txt= new JLabel("Fill the fields below");
        txt.setBounds(170,20,300,40);
        txt.setFont(new Font("Serif",Font.BOLD,20));
        window.add(txt);

        JLabel namelbl= new JLabel("Full Name:");
        namelbl.setBounds(100,100,100,25);
        window.add(namelbl);

        JLabel passlbl= new JLabel("Password:");
        passlbl.setBounds(100,140,100,25);
        window.add(passlbl);

        JLabel conPasslbl= new JLabel("Confirm Password:");
        conPasslbl.setBounds(100,180,140,25);
        window.add(conPasslbl);

        JTextField accountField= new JTextField();
        accountField.setBounds(210,100,190,25);
        window.add(accountField);

        JPasswordField passField= new JPasswordField();
        passField.setBounds(210,140,190,25);
        window.add(passField);

        JPasswordField conPassField= new JPasswordField();
        conPassField.setBounds(210,180,190,25);
        window.add(conPassField);

        window.setVisible(true);
    }
    public static void main(String[] args){
        new registerScreen();
    }
}
