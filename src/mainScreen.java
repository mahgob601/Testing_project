import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class mainScreen {
    mainScreen(){
        JFrame window=new JFrame("Main Window");
        window.setSize(1000,800);
        window.setLayout(null);
        window.getContentPane().setBackground(Color.decode("#6cb4e4"));
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topBar= new JPanel();
        topBar.setBounds(200,0,800,80);
        topBar.setBackground(Color.decode("#648cac"));
        topBar.setLayout(new BoxLayout(topBar,BoxLayout.Y_AXIS));
        window.add(topBar);

        JPanel sideBar =new JPanel();
        sideBar.setBounds(0,80,200,720);
        sideBar.setBackground(Color.decode("#b2b6b0"));
        sideBar.setLayout(new GroupLayout(sideBar));
        window.add(sideBar);


        JPanel titleBar= new JPanel();
        titleBar.setBounds(0,0,200,80);
        titleBar.setBackground(Color.decode("#354551"));
        window.add(titleBar);

        JLabel titleLabel= new JLabel("OBS");
        titleLabel.setBounds(5,5,100,50);
        titleLabel.setFont(new Font("Serif",Font.BOLD,40));
        titleLabel.setForeground(Color.white);
        titleBar.add(titleLabel);

        JLabel subLabel=new JLabel("A bank you can trust");
        subLabel.setForeground(Color.white);
        titleBar.add(subLabel);

        JLabel nameLabel=new JLabel("Name: "+"/User Name/");
        topBar.add(nameLabel);

        JLabel accountLabel= new JLabel("Account Number: "+"/Account Number/");
        topBar.add(accountLabel);

        JLabel balanceLabel= new JLabel("Balance: "+"/Balance/");
        topBar.add(balanceLabel);

        //--------Deposit Screen--------//
        JPanel depositPanel= new JPanel();
        depositPanel.setBounds(0,0,800,720);
        depositPanel.setBackground(Color.decode("#6cb4e4"));
        depositPanel.setLayout(new GroupLayout(depositPanel));

        JLabel depLabel= new JLabel("Deposit Menu");
        depLabel.setBounds(310,0,300,50);
        depLabel.setFont(new Font("Serif",Font.BOLD,30));
        depositPanel.add(depLabel);

        JLabel amountLabel= new JLabel("Amount:");
        amountLabel.setBounds(320,100,50,20);
        depositPanel.add(amountLabel);

        JTextField amountField= new JTextField();
        amountField.setBounds(370,100,100,20);
        depositPanel.add(amountField);

        JButton depbtn=new JButton("Deposit");
        depbtn.setBounds(370,140,90,40);
        depbtn.setBackground(Color.decode("#c5d8e1"));
        depositPanel.add(depbtn);
        //-------End of Deposit Screen-------//

        JPanel transPanel= new JPanel();
        transPanel.setBounds(200,80,800,720);
        transPanel.setLayout(new GroupLayout(transPanel));
        transPanel.add(depositPanel);


        //---------Withdraw Screen----------//
        JPanel withdrawPanel= new JPanel();
        withdrawPanel.setBounds(0,0,800,720);
        withdrawPanel.setBackground(Color.decode("#6cb4e4"));
        withdrawPanel.setLayout(new GroupLayout(withdrawPanel));

        JLabel withLabel= new JLabel("Withdraw Menu");
        withLabel.setBounds(310,0,300,50);
        withLabel.setFont(new Font("Serif",Font.BOLD,30));
        withdrawPanel.add(withLabel);

        JLabel amount2Label= new JLabel("Amount:");
        amount2Label.setBounds(320,100,50,20);
        withdrawPanel.add(amount2Label);

        JTextField amount2Field= new JTextField();
        amount2Field.setBounds(370,100,100,20);
        withdrawPanel.add(amount2Field);

        JButton withbtn=new JButton("Withdraw");
        withbtn.setBounds(370,140,90,40);
        withbtn.setBackground(Color.decode("#c5d8e1"));
        withdrawPanel.add(withbtn);
        //-------End of Withdraw Screen-------//

        //--------Transfer Screen--------//
        JPanel transferPanel= new JPanel();
        transferPanel.setBounds(0,0,800,720);
        transferPanel.setBackground(Color.decode("#6cb4e4"));
        transferPanel.setLayout(new GroupLayout(transferPanel));

        JLabel trnsfrLabel= new JLabel("Transfer Menu");
        trnsfrLabel.setBounds(310,0,300,50);
        trnsfrLabel.setFont(new Font("Serif",Font.BOLD,30));
        transferPanel.add(trnsfrLabel);

        JLabel targetLabel= new JLabel("Account:");
        targetLabel.setBounds(320,75,50,20);
        transferPanel.add(targetLabel);

        JTextField targetField= new JTextField();
        targetField.setBounds(370,75,100,20);
        transferPanel.add(targetField);

        JLabel amount3Label= new JLabel("Amount:");
        amount3Label.setBounds(320,100,50,20);
        transferPanel.add(amount3Label);

        JTextField amount3Field= new JTextField();
        amount3Field.setBounds(370,100,100,20);
        transferPanel.add(amount3Field);

        JButton trnsbtn=new JButton("Transfer");
        trnsbtn.setBounds(370,140,90,40);
        trnsbtn.setBackground(Color.decode("#c5d8e1"));
        transferPanel.add(trnsbtn);
        //-------End of Transfer Screen-------//

        //---------Pay Bill Screen----------//
        JPanel payPanel= new JPanel();
        payPanel.setBounds(0,0,800,720);
        payPanel.setBackground(Color.decode("#6cb4e4"));
        payPanel.setLayout(new GroupLayout(payPanel));

        JLabel payLabel= new JLabel("Pay Bill Menu");
        payLabel.setBounds(310,0,300,50);
        payLabel.setFont(new Font("Serif",Font.BOLD,30));
        payPanel.add(payLabel);

        JLabel billLabel= new JLabel("Bill Code:");
        billLabel.setBounds(310,100,80,20);
        payPanel.add(billLabel);

        JTextField billField= new JTextField();
        billField.setBounds(370,100,100,20);
        payPanel.add(billField);

        JButton paybtn=new JButton("Pay");
        paybtn.setBounds(370,140,90,40);
        paybtn.setBackground(Color.decode("#c5d8e1"));
        payPanel.add(paybtn);
        //-------End of Pay Bill Screen-------//

        //---------Buy Item Screen----------//
        JPanel buyPanel= new JPanel();
        buyPanel.setBounds(0,0,800,720);
        buyPanel.setBackground(Color.decode("#6cb4e4"));
        buyPanel.setLayout(new GroupLayout(buyPanel));

        JLabel buyLabel= new JLabel("Buy Item Menu");
        buyLabel.setBounds(310,0,300,50);
        buyLabel.setFont(new Font("Serif",Font.BOLD,30));
        buyPanel.add(buyLabel);

        JLabel itemLabel= new JLabel("Item Code:");
        itemLabel.setBounds(310,100,80,20);
        buyPanel.add(itemLabel);

        JTextField itemField= new JTextField();
        itemField.setBounds(370,100,100,20);
        buyPanel.add(itemField);

        JButton buy=new JButton("Purchase");
        buy.setBounds(370,140,90,40);
        buy.setBackground(Color.decode("#c5d8e1"));
        buyPanel.add(buy);
        //-------End of Buy Item Screen-------//

        //-------Side Bar Buttons---------//
        JButton depositbtn= new JButton("Deposit");
        depositbtn.setBounds(0,0,200,50);
        depositbtn.setBackground(Color.decode("#b2b6b0"));
        depositbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transPanel.removeAll();
                transPanel.add(depositPanel);
                transPanel.repaint();
            }
        });
        sideBar.add(depositbtn);

        JButton withdrawbtn= new JButton("Withdraw");
        withdrawbtn.setBounds(0,50,200,50);
        withdrawbtn.setBackground(Color.decode("#b2b6b0"));
        withdrawbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transPanel.removeAll();
                transPanel.add(withdrawPanel);
                transPanel.repaint();
            }
        });
        sideBar.add(withdrawbtn);

        JButton transferbtn= new JButton("Transfer");
        transferbtn.setBounds(0,100,200,50);
        transferbtn.setBackground(Color.decode("#b2b6b0"));
        transferbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transPanel.removeAll();
                transPanel.add(transferPanel);
                transPanel.repaint();
            }
        });
        sideBar.add(transferbtn);

        JButton payButton= new JButton("Pay Bill");
        payButton.setBounds(0,150,200,50);
        payButton.setBackground(Color.decode("#b2b6b0"));
        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transPanel.removeAll();
                transPanel.add(payPanel);
                transPanel.repaint();
            }
        });
        sideBar.add(payButton);

        JButton buybtn= new JButton("Buy Item");
        buybtn.setBounds(0,200,200,50);
        buybtn.setBackground(Color.decode("#b2b6b0"));
        buybtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transPanel.removeAll();
                transPanel.add(buyPanel);
                transPanel.repaint();
            }
        });
        sideBar.add(payButton);
        sideBar.add(buybtn);

        JButton logout= new JButton("Log Out");
        logout.setBounds(0,630,200,50);
        logout.setBackground(Color.decode("#b2b6b0"));
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.dispose();
                new loginScreen();
            }
        });
        sideBar.add(logout);
        //--------End of Side Bar Buttons---------//

        window.add(transPanel);
        window.setVisible(true);

    }
    public static void main(String[] args){
        new mainScreen();
    }
}
