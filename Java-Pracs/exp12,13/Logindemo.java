import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logindemo extends Applet{

		TextField Username,Password,DisplayUsername,DisplayPassword;
    Button Submit,Reset;
    Label user,pass;
    Font f1=new Font("Courier",Font.ITALIC,12);
    Font f2=new Font("Helvetica",Font.BOLD,15);


       public void init() {

				    setForeground(Color.RED);
				    setBackground(Color.CYAN);

				    setLayout(new FlowLayout(FlowLayout.LEFT));

						user=new Label("Username :",Label.CENTER);
						pass=new Label("Password : ",Label.CENTER);

						Username=new TextField(10);
						Password=new TextField(10);
						DisplayUsername = new TextField(10);
						DisplayPassword = new TextField(10);

						Submit=new Button("Submit");
						Reset=new Button("Reset");

				    Submit.setBackground(Color.WHITE);
				    Reset.setBackground(Color.WHITE);

				    Submit.setFont(f1);
				    Reset.setFont(f1);
				    user.setFont(f2);
				    pass.setFont(f2);

						add(user);
						add(Username);
						add(pass);
						add(Password);
						add(Submit);
						add(Reset);
						add(DisplayUsername);
						add(DisplayPassword);

						DisplayUsername.setVisible(false);
						DisplayPassword.setVisible(false);
  }

       public void paint(Graphics g) {

			    	   Submit.setLocation(50,60);
			    	   Reset.setLocation(110, 60);
			    	   user.setLocation(5,5);
			    	   Username.setLocation(100,5);
			    	   pass.setLocation(5,30);
			    	   Password.setLocation(100,30);
			    	   DisplayUsername.setLocation(5,100);
			    	   DisplayPassword.setLocation(120, 100);

			    	   Submit.addActionListener(new ActionListener() {

					    			@Override
					    			public void actionPerformed(ActionEvent e) {

					    			DisplayUsername.setVisible(true);
					    			DisplayPassword.setVisible(true);
					    			DisplayUsername.setText(Username.getText());
					    			DisplayPassword.setText(Password.getText());


			    			}

			    		});

			    	   Reset.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {

											DisplayUsername.setText(null);
							    		DisplayPassword.setText(null);
											DisplayUsername.setVisible(true);
							    		DisplayPassword.setVisible(true);

										}
							});
       }

 }
 //<applet code="Logindemo.class" width="500" height="500"></applet>
