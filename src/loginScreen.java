import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class loginScreen {
    loginScreen(){
        JFrame window=new JFrame("Login Window");
        window.setSize(500,400);
        window.setLayout(null);
        window.getContentPane().setBackground(Color.decode("#6cb4e4"));
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton loginBtn= new JButton("Login");
        loginBtn.setBounds(100,300,90,40);
        loginBtn.setBackground(Color.decode("#c5d8e1"));
        window.add(loginBtn);
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.dispose();
                new mainScreen();
            }
        });

        JButton rgstrBtn= new JButton("Register");
        rgstrBtn.setBounds(300,300,90,40);
        rgstrBtn.setBackground(Color.decode("#c5d8e1"));
        rgstrBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.dispose();
                new registerScreen();
            }
        });
        window.add(rgstrBtn);


        JLabel txt= new JLabel("Welcome to our Banking System");
        txt.setBounds(110,50,300,40);
        txt.setFont(new Font("Serif",Font.BOLD,20));
        window.add(txt);

        JLabel accountlbl= new JLabel("Account Number:");
        accountlbl.setBounds(100,150,100,25);
        window.add(accountlbl);

        JLabel passlbl= new JLabel("Password:");
        passlbl.setBounds(100,190,100,25);
        window.add(passlbl);

        JTextField accountField= new JTextField();
        accountField.setBounds(200,150,190,25);
        window.add(accountField);

        JPasswordField passField= new JPasswordField();
        passField.setBounds(200,190,190,25);
        window.add(passField);

        window.setVisible(true);
    }

    public static void main(String[] args){
        new loginScreen();
    }
}
