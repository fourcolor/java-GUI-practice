package final_410774004;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
public class GUI 
{
	private JFrame frame ;
	private CPanel1 Gpanel1 ;
	private CPanel2 Gpanel2 ;
	private String userinput;
	public GUI()
	{
		frame = new JFrame("Final Project");
		Gpanel1 = new CPanel1();
		Gpanel2 = new CPanel2();
	}
	public void run() 
	{
		frame.setSize(600, 900); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.add(Gpanel1.panel1);
		frame.add(Gpanel2);
		Gpanel1.run();
		for(int i=0;i<8;i++)
		{
			if(i!=6)
			Gpanel1.nButton[i].addActionListener(new triEventListener());
		}
		Gpanel1.nButton[6].addActionListener(new inputListener());
		Gpanel1.t.addActionListener(new inputListener());
        frame.setVisible(true);
        frame.setResizable(false);
	}
	class triEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) 
        {
        	if(e.getSource()==Gpanel1.nButton[0])
        	{
        		Gpanel2.fixTri(new sin());
        	}
        	if(e.getSource()==Gpanel1.nButton[1])
        	{
        		Gpanel2.fixTri(new cos());
        	}
        	if(e.getSource()==Gpanel1.nButton[2])
        	{
        		Gpanel2.fixTri(new tan());
        	}
        	if(e.getSource()==Gpanel1.nButton[3])
        	{
        		Gpanel2.fixTri(new cot());
        	}
        	if(e.getSource()==Gpanel1.nButton[4])
        	{
        		Gpanel2.fixTri(new sec());
        	}
        	if(e.getSource()==Gpanel1.nButton[5])
        	{
        		Gpanel2.fixTri(new csc());
        	}
        	if(e.getSource()==Gpanel1.nButton[7])
        	{
        		Gpanel2.fixTri(null);
        	}
        	Gpanel2.repaint();
        }
	}
	class inputListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			userinput=Gpanel1.t.getText();
			int i=Integer.parseInt(userinput);
			if(i<=100)
			{
				Gpanel2.fixH(Integer.parseInt(userinput));
			}
			else
			{
				Gpanel2.fixH(100);
			}
			Gpanel2.repaint();
		}
	}
}
