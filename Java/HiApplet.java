import java.awt.*;
import java.awt.event.*;
import java.applet.*;	//引用小应用程序中必须使用的包

public class HiApplet {	//	HiApplet 为 java.applet.Applet的子类
	public void paint(Graphics g) {
		g.drawString("Hi applet", 10, 10);
	}
}
