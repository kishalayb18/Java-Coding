 import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Registration_Form_T2 extends JFrame implements ActionListener//, ItemListener
{
	private int x,y,z;
    private JPanel[] p;
    int i,j;
    private String s1,s2,s3,s4,s5,s6,s7,s8,s9;
    
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    private JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
    private JButton b1,b2,b3;
    private JComboBox cb1,cb2,cb3,cb4;
    private JRadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7; 
    private JCheckBox ch1,ch2,ch3,ch4,ch5,ch6,ch7;
    private String sch1,sch2,sch3,sch4,sch5,sch6,sch7;
    public Registration_Form_T2() 
    {
    	super("REGISTRATION FORM");
    	
    	setTitle("REGISTRATION FORM");
    	
    	String[] day={"","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    	String[] month={"","1","2","3","4","5","6","7","8","9","10","11","12"};
    	String[] year={"","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
    	String[] pob={"","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
    	
    	/*for(i=1;i<=31;i++)
    	{
    		cb1.addItemListener(String.valueOf(i));
    	}
    	for(i=1;i<=12;i++)
    	{
    		cb2.addItemListener(String.valueOf(i));
    	}
    	for(i=1990;i<=2020;i++)
    	{
    		cb3.addItemListener(String.valueOf(i));
    	}
    	for(i=2015;i<=2024;i++)
    	{
    		cb4.addItemListener(String.valueOf(i));
    	}*/
    	
        l1=new JLabel("NAME:");
        l2=new JLabel("DATE OF BIRTH:");
        l3=new JLabel("GENDER:");
        l4=new JLabel("E-Mail:");
        l5=new JLabel("CONTACT NUMBER:");
        l6=new JLabel("COLLEGE NAME:");
        l7=new JLabel("HIGHEST QUALIFICATION:");
        l8=new JLabel("YEAR OF GRADUATION:");
        l9=new JLabel("COMPUTER SKILLS:");
        
        tf1=new JTextField(10);//name
        tf2=new JTextField(10);//mail
        tf3=new JTextField(10);//mobile no
        tf4=new JTextField(10);//clg name
        
        cb1=new JComboBox(day); 	//FOR DOB
    	cb2=new JComboBox(month);
    	cb3=new JComboBox(year);
    	
    	cb4=new JComboBox(pob);	//FOR PASS OUT YEAR
    	
    	
    	rb1=new JRadioButton("Male");
    	rb2=new JRadioButton("Female");
    	rb3=new JRadioButton("Others");	
    	ButtonGroup br1=new ButtonGroup();	//FOR GENDER
    	br1.add(rb1);
    	br1.add(rb2);
    	br1.add(rb3);	
    	
    	rb4=new JRadioButton("10th");
    	rb5=new JRadioButton("12th");
    	rb6=new JRadioButton("Graduate");
    	rb7=new JRadioButton("Post Graduate");	
    	ButtonGroup br2=new ButtonGroup();	//FOR QUALIFICATION
    	br2.add(rb4);
    	br2.add(rb5);
    	br2.add(rb6);
    	br2.add(rb7);
        
        ch1= new JCheckBox("C programing");
        ch2= new JCheckBox("Java");
        ch3= new JCheckBox("Python");
        ch4= new JCheckBox("HTML");
        ch5= new JCheckBox("CSS");
        ch6= new JCheckBox("PHP");
        ch7= new JCheckBox("DBMS");	
        
        b1=new JButton("Close");
        b2=new JButton("Submit"); 
        b3=new JButton("Reset");
       		
        p=new JPanel[10]; 
        for(int i=0;i<p.length;i++)
        {
             p[i]=new JPanel();
        }
       	p[0].setLayout(new GridLayout(1,2,5,5));	    	
       	p[0].add(l1);
       	p[0].add(tf1);
       	
       	p[1].setLayout(new GridLayout(1,2,5,5));	// 1 row 2 col, hor gap, vert gap 
       	p[1].add(l2);
       	p[1].add(cb1);
       	p[1].add(cb2);
       	p[1].add(cb3);
       	
        p[2].setLayout(new GridLayout(1,2,5,5));     	
        p[2].add(l3);
       	p[2].add(rb1);
      	p[2].add(rb2);
      	p[2].add(rb3);
       	
        p[3].setLayout(new GridLayout(1,2,5,5));      	
        p[3].add(l4);
       	p[3].add(tf2);       	
        
        p[4].setLayout(new GridLayout(1,2,5,5));        	
       	p[4].add(l5);
       	p[4].add(tf3);
       	
       	p[5].setLayout(new GridLayout(1,2,5,5));
       	p[5].add(l6);
       	p[5].add(tf4);
       	
       	p[6].setLayout(new GridLayout(1,2,5,5));
       	p[6].add(l7);
       	p[6].add(rb4);
       	p[6].add(rb5);
       	p[6].add(rb6);
       	p[6].add(rb7);
       	
       	p[7].setLayout(new GridLayout(1,2,20,5));
       	p[7].add(l8);
       	p[7].add(cb4);
       	
       	p[8].setLayout(new GridLayout(1,2,5,5));
       	p[8].add(l9);
       	p[8].add(ch1);
       	p[8].add(ch2);
       	p[8].add(ch3);
       	p[8].add(ch4);
       	p[8].add(ch5);
       	p[8].add(ch6);
       	p[8].add(ch7);
       	
       	p[9].setLayout(new GridLayout(1,3,20,20));
       	p[9].add(b1);
       	p[9].add(b2);
       	p[9].add(b3);
       	
       	Container c=getContentPane();
       	c.setLayout(new GridLayout(5,3,10,10));
       	for(int i=0;i<p.length;i++)
       	{
       		c.add(p[i]);
       	}
       	
        b1.addActionListener(this);	
       	b2.addActionListener(this);
       	b3.addActionListener(this);
       	
       	setBackground(Color.cyan);
       	setResizable(false);	
       	setSize(1000,1800);		//SIZE OF PANEL
       	setVisible(true);	
    }
	


    
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==b1)
    	{
    		System.exit(0);
    	}
    	
    	else if(e.getSource()==b2)
    	{
    		 s1="Name : "+tf1.getText();	
    		 
    		 s2="DOB : "+cb1.getSelectedItem()+"-"+cb2.getSelectedItem()+"-"+cb3.getSelectedItem();
    		 
/***** GENDER *******/    		 	
    		 if(rb1.isSelected())
    		 	s3="Gender : Male";
    		 else if(rb2.isSelected())
    		 	s3="Gender : Female";
    		 else if(rb3.isSelected())
    		 	s3="Gender : Others";
    		 else 
    		 	s3="Gender : ";
    		 	
/***** PERSONAL DETAILS *******/
    		 	
    		 s4="Email :"+tf2.getText();
    		 
    		 s5="Contac Number : "+tf3.getText();
    		 
    		 s6="College Name : "+tf4.getText();
    		 
/***** HIGHEST QUALIFICATION *******/

    		 if(rb4.isSelected())
    		 	s7="Highest Qualification : 10th";
    		 else if(rb5.isSelected())
    		 	s7="Highest Qualification : 12th"; 		
    		 else if(rb6.isSelected())
    		 	s7="Highest Qualification : Graduate";
    		 else if(rb7.isSelected())
    		 	s7="Highest Qualification : Post Graduate";
    		 else
    		 	s7="Highest Qualification : ";
    		 	
    		 s8="Year of Graduation :"+cb4.getSelectedItem();
    		 
/***** COMPUTER SKILL *******/    		 
			
			if(ch1.isSelected())	
			{
	  	 		sch1="C ";	
	  		}
	  		else
	  		{
	  			sch1="";
	  		}	  
			if(ch2.isSelected())
			{
	  	 		sch2="Java ";	
	  		}
	  		else
	  		{
	  			sch2="";
	  		}	
			if(ch3.isSelected())
			{
	  	 		sch3="Python ";	
	  		}
	  		else
	  		{
	  			sch3="";
	  		}	 
			if(ch4.isSelected())
			{
	  	 		sch4="HTML ";	
	  		}
	  		else
	  		{
	  			sch4="";
	  		}	 
			if(ch5.isSelected())
			{
	  	 		sch5="CSS ";	
	  		}
	  		else
	  		{
	  			sch5="";
	  		}
			if(ch6.isSelected())
			{
	  	 		sch6="PHP ";	
	  		}
	  		else
	  		{
	  			sch6="";
	  		}	 
			if(ch7.isSelected())
	  		{
	  	 		sch7="DBMS ";	
	  		}
	  		else
	  		{
	  			sch7="";
	  		}
	  		
    		s9="Computer Skills : "+sch1 +" "+ sch2 +" "+ sch3 +" "+ sch4 +" "+ sch5+" "+sch6+" "+sch7;
    		
/*****DIALOUGE BOX *******/   		 
    		 
    		JOptionPane.showMessageDialog(null,s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5+"\n"+s6+"\n"+s7+"\n"+s8+"\n"+s9);
        
    	}	 
    	
    	else if(e.getSource()==b3)
    	{
    		tf1.setText("");
    		tf2.setText("");    		
    		tf3.setText("");
    		tf4.setText(""); 	
    		cb1.setSelectedIndex(0);
    		cb2.setSelectedIndex(0);
    		cb3.setSelectedIndex(0);
    		cb4.setSelectedIndex(0);
    	}
    }   
    public static void main (String[] args) 
    {
    	Registration_Form_T2 ob=new Registration_Form_T2();
    }
}