import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stopwatchapplet extends Applet implements Runnable, ActionListener{


			Button start,reset,stop;
			Label Stopwatch;
			static Label timer;
			Font f2=new Font("Helvetica",Font.BOLD,30);
			static int hours;
			static int mins;
			static int seconds;
			boolean on=false;
			static String disp;

			public void init() {

					    setForeground(Color.RED);
					    setBackground(Color.CYAN);

					    Stopwatch=new Label("STOPWATCH",Label.CENTER);

					    timer=new Label();

							start=new Button("Start");
							reset=new Button("Reset");
							stop=new Button("Stop");

					    start.setBackground(Color.YELLOW);
					    reset.setBackground(Color.YELLOW);
					    stop.setBackground(Color.YELLOW);

					    start.addActionListener((ActionListener) this);
					    reset.addActionListener((ActionListener) this);
					    stop.addActionListener((ActionListener) this);

					    disp="00:00:00";
					    timer.setText(disp);

					    add(Stopwatch);
					    add(start);
					    add(reset);
					    add(stop);
					    add(timer);

			}

		public void paint(Graphics g) {

							Stopwatch.setLocation(50,15);
							start.setLocation(15,40);
							stop.setLocation(80,40);
							reset.setLocation(145,40);
							timer.setLocation(70,100);
		}

		public void run() {
				while(on) {
				    try{
							Thread.sleep(1000);
							updateTimer();
					} catch (InterruptedException e) {
							e.printStackTrace();
					}
				}
   	}
	public static void updateTimer() {

			seconds++;
			if (seconds == 60) {
	            seconds = 0;
	            mins++;
	            if (mins == 60) {
	                mins = 0;
	                hours++;
	            }
	        }

			if (hours < 10)
	            disp = "0" + hours + " : ";
	        else
	            disp = hours + " : ";

	        if (mins < 10)
	            disp += "0" + mins + " : ";
	        else
	            disp += mins + " : ";

	        if (seconds < 10)
	            disp += "0" + seconds;
	        else
	            disp += seconds;

	        timer.setText(disp);

	}
	public static void reset() {
			try {
					Thread.sleep(200);

					hours = mins = seconds= 0;

					if (hours < 10)
	            disp = "0" + hours + " : ";
	        else
	            disp = hours + " : ";

	        if (mins < 10)
	            disp += "0" + mins + " : ";
	        else
	            disp += mins + " : ";

	        if (seconds < 10)
	            disp += "0" + seconds;
	        else
	            disp += seconds + "  ";

					timer.setText(disp);
		}
		 catch (InterruptedException e) {

					e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e){

        if (e.getSource() == start) {
            on = true;
            new Thread(this).start();
        }
        if (e.getSource() == reset) {
            on = false;
            reset();
        }
        if (e.getSource() == stop) {
            on = false;
        }
    }

}
