import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Binary_Decimal extends JFrame implements ActionListener
{
	private JLabel a1,a2,a3,a4;
	private JTextField t1,t2,t3,t4;
	private JButton b1,b2,b3;
	private JPanel []p;
	private JComboBox cb;
	
	public Binary_Decimal()
	{
		super("Binary Decimal Convrtion");
		
		String [] option={"Binary To Decimal", "Decimal To Binary"};	//jCombo
		cb=new JComboBox(option);
		
		a1=new JLabel("Input");
		a2=new JLabel("Output");
		a3=new JLabel("Option");
		
		t1=new JTextField(20);
		t2=new JTextField(20);
		
		b1=new JButton("Convert");
		b2=new JButton("Rest");
		b3=new JButton("Close");
		
		p=new JPanel[4];
		for(int i=0; i<p.length;i++)
		{
			p[i]=new JPanel();
		}
		p[0].setLayout(new GridLayout(1,2,20,20));
		p[0].add(a1);
		p[0].add(t1);
		
		p[1].setLayout(new GridLayout(1,2,20,20));
		p[1].add(a2);
		p[1].add(t2);
		
		p[2].setLayout(new GridLayout(1,2,20,20));
		p[2].add(a3);
		p[2].add(cb);
		
		p[3].setLayout(new GridLayout(1,3,20,20));
		p[3].add(b3);
		p[3].add(b1);
		p[3].add(b2);
		
		b1.addActionListener(this);	
       	b2.addActionListener(this);
       	b3.addActionListener(this);
		
		Container c=getContentPane();
       	c.setLayout(new GridLayout(4,2,10,10));
       	for(int i=0;i<p.length;i++)
       	c.add(p[i]);
     	
       	setBackground(Color.cyan);
       	setResizable(false);	//resize can't be done	
       	setSize(400,200);
       	setVisible(true);
	}
	
	public static String ToDeci(String k)
	{
		String x="";
		for(int i=0;i<k.length();i++)	//Reversing The String
		{
			x=k.charAt(i)+x;
		}
		k=x;
		
		int m=k.length();
		int sum=0;
		for(int i=0;i<m;i++)
		{
			char z= k.charAt(i);
			if(z=='1')
			{
				int y=(int)Math.pow(2,i);
				sum=sum+y;
			}
		}
		String dec=String.valueOf(sum);
		
		return dec;
	}
	
	public static String toBinary(String deci)
	{
		int n=Integer.parseInt(deci);
		String b="";
		while(n>0)
		{
				int d=n%2;
				b=d+b;
				n=n/2;
		}
		return b;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String s1=t1.getText();
			if(cb.getSelectedIndex()==0)
			{
				String s2=ToDeci(s1);
				t2.setText(s2);
			}
			else if(cb.getSelectedIndex()==1)
			{
				String s3=toBinary(s1);
				t2.setText(s3);
			}
		}
		
		if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
		}
		
		if(e.getSource()==b3)
		{
			System.exit(0);
		}
	}
}

class Main_Binary_Decimal
{
	public static void main (String[] args) {
		Binary_Decimal ob=new Binary_Decimal();
		
	}
}