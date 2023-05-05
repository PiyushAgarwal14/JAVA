import java.awt.*;
import java.applet.*;

/* <applet code ="SimpleBanner" width="400" height="200">
	</applet> */

public class SimpleBanner extends Applet implements Runnable{

String msg="POORNIMA GROUP OF INSTITUTIONS";

	Thread t= null;
	int state;
	boolean flag;

	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);
	}

	public void start(){
		t = new Thread(this);
		flag=false;
		t.start();
	}

	public void run(){
		char ch;
		
		for( ; ; ){
			try{
			repaint();
			Thread.sleep(250);
			ch=msg.charAt(msg.length()-1);

			msg = msg.substring(0,msg.length()-1);
			msg=ch+ msg;

			if(flag)
			break;
		}
			catch(InterruptedException e)
			{
				System.out.println("error" +e);
			}
		}

	}
			public void stop(){
				flag=true;
				t=null;
			}
			
			public void paint (Graphics g){
				g.drawString(msg, 40,40);
			}
}