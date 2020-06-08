package final_410774004;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class CPanel1// extends JPanel 
{
	JPanel panel1;
	private String[] name;
	private int[][] att;
    JButton[] nButton = new JButton[8];
	private ArrayList<JComponent> CPanel1Component;
	JTextField t;
	
	CPanel1() {
		panel1 = new JPanel();
		panel1.setSize(600, 300);
		int fill[] = { 
				GridBagConstraints.BOTH, 
				GridBagConstraints.VERTICAL, 
				GridBagConstraints.HORIZONTAL,
				GridBagConstraints.NONE
		};
		int anchor[] = { 
				GridBagConstraints.CENTER, 
				GridBagConstraints.EAST, 
				GridBagConstraints.SOUTHEAST,
				GridBagConstraints.SOUTH, 
				GridBagConstraints.SOUTHWEST, 
				GridBagConstraints.WEST,
				GridBagConstraints.NORTHWEST, 
				GridBagConstraints.NORTH, 
				GridBagConstraints.NORTHEAST };
		String n[] = { 
				"sin", 
				"cos", 
				"tan", 
				"cot", 
				"sec", 
				"csc",
				"箭頭(<=100)", 
				"繪圖", 
				"清除"
		};
		name = n;
		int a[][] = { 
				{0,0,1,1,0,0,fill[2],anchor[5]},//sin
				{1,0,1,1,0,0,fill[2],anchor[5]},//cos
				{2,0,1,1,0,0,fill[2],anchor[5]},//tan
				{3,0,1,1,0,0,fill[2],anchor[5]},//cot
				{4,0,1,1,0,0,fill[2],anchor[5]},//sec
				{5,0,1,1,0,0,fill[2],anchor[5]},//csc
				{0,2,2,1,0,0,fill[2],anchor[5]},//箭頭(<=100)
				{2,2,3,1,0,0,fill[2],anchor[5]},//[  ]
				{0,3,1,1,0,0,fill[2],anchor[5]},//繪圖
				{1,3,1,1,0,0,fill[2],anchor[5]},//清除

		};	
		att = a;
		CPanel1Component = new ArrayList<JComponent>();
	}
	public void run() 
	{
	    panel1.setLayout(new GridBagLayout());
		for(int i=0;i<6;i++)
		{
			nButton[i] = new JButton(name[i]);
			CPanel1Component.add(nButton[i]);
		}
		JLabel nlabel =new JLabel(name[6]);
		CPanel1Component.add(nlabel);
		t = new JTextField();
		CPanel1Component.add(t);
		for(int i=7;i<9;i++)
		{
			nButton[i-1] = new JButton(name[i]);
			CPanel1Component.add(nButton[i-1]);
		}
        for (int i = 0; i < CPanel1Component.size(); i++) {
            addComponent(i);
        } 
	}
	private void addComponent(int i) {
	        GridBagConstraints c = new GridBagConstraints();
	        int a[] = att[i];          
	        c.gridx = a[0];
	        c.gridy = a[1];
	        c.gridwidth = a[2];
	        c.gridheight = a[3];
	        c.weightx = a[4];
	        c.weighty = a[5];
	        c.fill = a[6];
	        c.anchor = a[7];
	        panel1.add(CPanel1Component.get(i), c);
	    }
}
