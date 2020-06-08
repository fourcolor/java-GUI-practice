package final_410774004;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Graphics;
import java.util.*;
public interface TrigonometricFunction
{
	double getY(double x);
	String getname();
}
class sin implements TrigonometricFunction
{

	@Override
	public double getY(double x) {
		return 600- 100*Math.sin(x);
	}
	public String getname()
	{
		return "sin";
	}
	
}
class cos implements TrigonometricFunction
{

	@Override
	public double getY(double x) {
		return 600-100*Math.cos(x);
	}
	public String getname()
	{
		return "cos";
	}
	
}
class tan implements TrigonometricFunction
{

	@Override
	public double getY(double x) {
		if(Math.tan(x)==0)
		{
			return 10000;
		}
		else
		return 600-100*Math.tan(x);
	}
	public String getname()
	{
		return "tan";
	}
	
}
class cot implements TrigonometricFunction
{

	@Override
	public double getY(double x) {
		return 600- (100.0)/(Math.tan(x));
	}
	public String getname()
	{
		return "cot";
	}
	
}
class sec implements TrigonometricFunction
{

	@Override
	public double getY(double x) {
		if(Math.cos(x)==0)
		{
			return 10000;
		}
		else
		return 600-(100.0)/Math.cos(x);
	}
	public String getname()
	{
		return "sec";
	}
	
}
class csc implements TrigonometricFunction
{

	@Override
	public double getY(double x) {
		if(Math.sin(x)==0)
		{
			return 10000;
		}
		else
		return 600- (100.0)/(Math.sin(x));
	}
	public String getname()
	{
		return "csc";
	}
	
}
