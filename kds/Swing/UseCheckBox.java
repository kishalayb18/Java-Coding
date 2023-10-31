import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class UseCheckBox extends JFrame implements ItemListener,ActionListener
{
	private JCheckBox r1,r2,r3;
	private JButton b1;
	private Container c=null;
	private String s1,s2,s3;
	public UseCheckBox()
	{
		super("calc");
		s1="";
		s2="";
		s3="";
		r1=new JCheckBox("c");
		r2=new JCheckBox("c++");
		r3=new JCheckBox("java");
		b1=new JButton("ok");
		c=getContentPane();		//CREATING CONTENT PANE
		c.setLayout(new FlowLayout());	//SELECTING LAYOUT
		c.add(r1);
		c.add(r2);
		c.add(r3);
		c.add(b1);
		
		r1.addItemListener(this);
		r2.addItemListener(this);
		r3.addItemListener(this);
		
		b1.addActionListener(this);
		
		setResizable(false);
		setSize(400,200);
		setVisible(true);
		
	}
	public void itemStateChanged(ItemEvent e)	//for checking the status
	{
	  if(e.getSource()==r1)
	  {
	  	if(e.getStateChange()==1)
	  	{
	  	   s1="c";	
	  	}
	  	else
	  	{
	  		s1="";
	  	}	  		
	  }
	  if(e.getSource()==r2)
	  {
	  	if(e.getStateChange()==1)
	  	{
	  	   s2="c++";	
	  	}
	  	else
	  	{
	  		s2="";
	  	}	  		
	  }
	   if(e.getSource()==r3)
	  {
	  	if(e.getStateChange()==1)
	  	{
	  	   s3="java";	
	  	}
	  	else
	  	{
	  		s3="";
	  	}	  		
	  }
	}
	
	public void actionPerformed(ActionEvent e1)
	{
		if(e1.getSource()==b1)
		{
			JOptionPane.showMessageDialog(null,s1+" "+s2+" "+s3);
		}
	}
	
	public static void main (String[] args) 
		{
			UseCheckBox r=new UseCheckBox();
        }
}