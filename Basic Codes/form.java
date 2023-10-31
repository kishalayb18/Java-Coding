import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class Registration extends JFrame implements ActionListener,ItemListener{

	private JButton b1,b2;

	private JRadioButton r1,r2;

	private JTextField t1,t2,t3,t4,t5;

	private JLabel l1,l2,l3,l4,l5,l6;

	private JPanel[] p;

     private JCheckBox c1,c2,c3;
     private JComboBox d,m,y;
     	
     	public Registration()
     	{
     	super("Resistration");
     	
     	d=new JComboBox();
     	m=new JCheckBox();
     	y=new JComboBox(); 

		b1=new JButton("Submit");

		b2=new JButton("Reset");

		t1=new JTextField(20);

		t2=new JTextField(20);

		t3=new JTextField(20);
		
		t4=new JTextField(20);

		t5=new JTextField(20);
			l1=new JLabel("Name*");

		l2=new JLabel("Email*");

		l3=new JLabel("Mobile");
		
		l4=new JLabel("DOB");
		
		l5=new JLabel("Password");
		
		l6=new JLabel("Registration Form");	

		r1=new JRadioButton("Mr.");

		r2=new JRadioButton("Mrs.");

		c1=new JCheckBox("I accept the Terms & Condition");

		ButtonGroup bg=new ButtonGroup();

		bg.add(r1);
		bg.add(r2);	p=new JPanel[8];
		for(int i=0;i<p.length;i++)
		{
			p[i]=new JPanel();
		}
		p[0].setLayout(new GridLayout(1,1));
		
		p[0].add(l6);

		p[1].setLayout(new GridLayout(1,4,10,20));

		p[1].add(l1);

		p[1].add(r1);

		p[1].add(r2);

		p[1].add(t1);

		p[2].setLayout(new GridLayout(1,2,20,20));

		p[2].add(l2);
		p[3].setLayout(new GridLayout(1,2,20,20));

		p[3].add(l3);

		p[3].add(t3);

		p[4].setLayout(new GridLayout(1,2,20,20));

		p[4].add(l4);

		p[4].add(t4);

		p[5].setLayout(new GridLayout(1,2,20,20));

		p[5].add(l5);

		p[5].add(t5);

		p[6].setLayout(new GridLayout(1,2,20,20));

		p[6].add(b1);

		p[6].add(b2);
	p[7].setLayout(new GridLayout(1,1,20,20));

		p[7].add(c1);
		Container c=getContentPane();
		c.setLayout(new GridLayout(8,2,20,20));
		for(int i=0;i<p.length;i++)
       	{
       	  c.add(p[i]);
       	}
       	b1.addActionListener(this);

       	b2.addActionListener(this);

       	b1.addItemListener(this);

       	b2.addItemListener(this);

       	t1.addActionListener(this);

       	t2.addActionListener(this);
       	
       	t3.addActionListener(this);

		t4.addActionListener(this);
			
       	r1.addItemListener(this);

       	r2.addItemListener(this);

       	c1.addItemListener(this);

       	c1.addActionListener(this);

       	r1.addActionListener(this);

       	r2.addActionListener(this);

       	setBackground(Color.cyan);

       	setResizable(true);	

       	setSize(500,300);

       	setVisible(true);

       	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       	public void actionPerformed()