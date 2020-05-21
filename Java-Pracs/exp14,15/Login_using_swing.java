import javax.swing.*;
import java.awt.event.*;
public class loginswing
 {
    public static void main(String[] args)
    {
    JFrame f=new JFrame("LOGIN PAGE ");
    JLabel Username,Password;
    JTextField Usernametf,dispUsername,dispPassword;
    JPasswordField Passwordf;
    JButton Login,Reset;

    Username=new JLabel("Username :");
    Username.setBounds(20,20, 80,30);
    Password=new JLabel("Password :");
    Password.setBounds(20,75, 80,30);

    Usernametf= new JTextField();
    Usernametf.setBounds(100,20, 170,30);
    Passwordf = new JPasswordField();
    Passwordf.setBounds(100,75,170,30);

 		Login = new JButton("Login");
    Login.setBounds(100,120, 80,30);
    Reset = new JButton("reset");
    Reset.setBounds(200,120, 80,30);

		dispUsername= new JTextField();
		dispUsername.setBounds(100,200,100,30);
		dispPassword= new JTextField();
		dispPassword.setBounds(220,200,100,30);

                f.add(Username);
                f.add(Usernametf);
                f.add(Password);
                f.add(Passwordf);
                f.add(Login);
                f.add(Reset);
                f.add(dispUsername);
    						f.add(dispPassword);

                f.setSize(700,700);
                f.setLayout(null);
                f.setVisible(true);

               Login.addActionListener(new ActionListener() {
               @Override
                public void actionPerformed(ActionEvent e) {
                dispUsername.setVisible(true);
                dispPassword.setVisible(true);
                dispUsername.setText(Usernametf.getText());
                dispPassword.setText(Passwordf.getText());
                }
             });

               Reset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                dispUsername.setText(null);
                dispPassword.setText(null);
                dispUsername.setVisible(true);
                dispPassword.setVisible(true);



            }
        });
}
}
