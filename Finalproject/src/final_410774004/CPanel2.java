package final_410774004;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
public class CPanel2 extends Canvas
{
	private TrigonometricFunction tri;
	private int h;
	CPanel2()
	{
		setSize(600, 600);
		h=10; 
	}
	public void paint(Graphics g)
	{
		if(tri!=null)
		{
			g=getGraphics();
			g.setColor(Color.blue); 
			g.drawLine(0, 600, 430, 600);
		    int x[] = {430, 430, 430+h, 430};
	        int y[] = {600, 600+h, 600, 600-h};
	        for(int i=0;i<5;i++)
	        {
	        	g.drawString(""+i*90,i*90,615);
	        }
	        g.drawString("deg", 400, 615);
		    g.fillPolygon(x, y, 4);
		    g.setColor(Color.black);
		    for(int i=0;i<360;i++)
		    {
		    	g.drawLine(i, (int)tri.getY(Math.toRadians(i)), i+1, (int)tri.getY(Math.toRadians(i+1)));
		    }
		    g.setColor(Color.red);
		    Font myFont = new Font ("楷體", 1, 30);
		    g.setFont (myFont);
		    g.drawString (tri.getname()+"的圖形", 380, 400);
		}
	}
	void fixTri(TrigonometricFunction t)
	{
		tri=t;
	}
	void fixH(int i)
	{
		h=i;
	}
}
