import java.applet.*;
import java.awt.*;

/* <applet code ="app5" width="500" height="1000" > 
</applet> */


public class app5 extends Applet{

	public void init(){
		Color c1 =new Color(255,255,255);
		setBackground(c1);
	
	}

	public void paint(Graphics g){
		
		g.setColor(Color.PINK);
		g.fillRect(100,150,70,150);	//rect left side 

		g.setColor(Color.ORANGE);
		g.fillRect(170,150,300,150);	// rect right side


		g.setColor(Color.BLACK);
		g.drawLine(135,15,100,150);	//traingle line left  side
		g.drawLine(135,15,170,150); 	//triangle line right side

		g.drawLine(135,15,470,15);	//roof line horizontal
		g.drawLine(470,15,470,150);	//roof line vertical


		g.setColor(Color.BLUE);
		g.fillRect(120,230,30,70);  //gate
		
		g.setColor(Color.BLUE);
		g.fillRect(250,200,70,50);	//window
			

		g.setColor(Color.BLACK);
		g.drawLine(280,200,280,250);	//window partition vertical	

		g.drawLine(250,220,320,220);	//window partition horizontal


		g.setColor(new Color(153,102,0));
		g.fillRect(550,150,30,150);   //tree log

		g.setColor(new Color(0,255,0));	
		g.fillOval(515,55,100,100);	//Tree Leaf

		
		g.setColor(new Color(244,164,96));		
		g.fillRect(0,300,2000,200);	//Road


		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));

		g2.setColor(Color.BLACK);
		g2.drawOval(650,250,50,50);	//left wheel
		g2.drawOval(740,250,50,50);	//right wheel

		g2.drawRect(675,270,95,1);	// wheel chain


    		 g2.drawLine(690,190,720,230); 	// tilted horizontal handle
		 g2.drawLine(700,210,670,250);	// tilted verticle handle

		 g2.drawLine(680,240,760,240);
			
		 g2.drawLine(760,220,760,250);	//Seat rod
		 
		 g2.drawRect(750,215,20,5);		//seat

		
		g2.drawString("MADE BY: PIYUSH AGARWAL", 200,600); 
		}
}