
import java.applet.*;
import java.awt.*;

public class Applet_face_shape extends Applet {

	public void paint(Graphics g) {

		g.setColor(Color.yellow);
		g.fillOval(20,20,150,150);   // For face
		g.setColor(Color.black);
		g.fillOval(50,60,25,40);     // Left Eye
		g.fillOval(120,60,25,40);    // Right Eye
		g.fillRect(95, 100,2,20);    //Nose
		g.setColor(Color.red);
		g.fillRect(70,130,50,10);         //red Background of creepy smile
		g.setColor(Color.black);
		g.fillRect(70,135,50,1);        // Creepy Smile

		 }

	}

//<applet code="Applet_face_shape.class" width="500" height="500"></applet>
