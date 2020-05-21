import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Banner extends Applet implements Runnable{

			String str,str1,str2,str3,str4;
			Thread t ;
			Font f2;
			Image joker;
			Font f1;
			String link;
			Button b,submit;
			TextField name,email,message;
			Label name1,email1,message1;

			public void init() {
			      str = "Kya aapke tooothpaste me namak hai?...";
			      str1 = "Agar nahi hai toh..";
			      str2 = "Lijiye Colgate++";
			      str3 = "And paaye Joker jesi smile";
			      str4 = "So what are you waiting for??? Click Here : ";

			      setBackground(Color.CYAN);
			      setForeground(Color.BLUE);

			      f2=new Font("Helvetica",Font.BOLD,15);
			      f1=new Font("Courier",Font.ITALIC,12);

			      name1=new Label("Name :",Label.CENTER);
			      email1=new Label("Email :",Label.CENTER);
			      message1=new Label("Message :",Label.CENTER);

			      name=new TextField(10);
			      email=new TextField(10);
			      message = new TextField(20);

			      joker = getImage(getCodeBase(), "https://bloody-disgusting.com/wp-content/uploads/2019/04/Screen-Shot-2019-04-03-at-8.02.29-AM-e1554296588989.png");

			      prepareImage(joker, 20, 20, this);

			      b = new Button("Contact Us");
			      submit = new Button("Submit");

			      t = new Thread(this);
			      t.start();

			      add(name);
			      add(email);
			      add(message);
			      add(b);
			      add(name1);
			      add(email1);
			      add(message1);
			      add(submit);

			      name.setVisible(false);
			      email.setVisible(false);
			      message.setVisible(false);

			      name1.setVisible(false);
			      email1.setVisible(false);
			      message1.setVisible(false);
			      submit.setVisible(false);
			}

			 public void paint(Graphics g) {

				      g.drawRect(1,1,300,150);
				      g.setColor(Color.GREEN);
				      g.fillRect(1,1,300,150);
				      g.setColor(Color.magenta);
				      g.setFont(f2);
				      g.drawString(str,10, 150);
				      g.drawImage(joker, 10, 10,280,130,this);
				      g.setColor(Color.GRAY);
				      g.setFont(f2);
				      g.drawString(str1, 20, 220);
				      g.drawString(str2, 50, 240);
				      g.drawString(str3, 70, 260);
				      g.drawString(str4, 50,300);

				      b.setLocation(360,285);
				      name.setLocation(360,320);
				      email.setLocation(360,360);
				      message.setLocation(360,400);

				      submit.setLocation(360,430);
				      name1.setLocation(280,320);
				      email1.setLocation(280,360);
				      message1.setLocation(280,400);

				      b.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {

							name.setVisible(true);
						    email.setVisible(true);
						    message.setVisible(true);
						    name1.setVisible(true);
						    email1.setVisible(true);
						    message1.setVisible(true);
						    submit.setVisible(true);
						    repaint();

						}
					});


			 }


		    public void run () {    //floating text
			    char ch;

			    while(true){
				      try {
				         repaint();
				         Thread.sleep(150);
				         ch = str.charAt(0);
				         str = str.substring(1, str.length());
				         str = str + ch;
				      }
				      catch(InterruptedException e) {
				    	  e.printStackTrace();
				      }
			      }
			 }
}
//<applet code="Banner.class" width="500" height="500"></applet>
