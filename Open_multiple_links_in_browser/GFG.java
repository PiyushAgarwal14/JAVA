import java.awt.Desktop;
import java.io.*;
import java.net.URI;

class GFG {
	//No of tabs to be opened:
	static int n = 10;

	public static void main(String[] args)
			throws Exception
	{
		Desktop desk = Desktop.getDesktop();
		
		for(int i = 0; i < n; i++){
			desk.browse(new URI("https://youtu.be/Pvu4SPpMNQ0"));
		}
	}
}
