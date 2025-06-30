import java.awt.*;
import javax.swing.*; //need to import fr Jframe
import java.awt.event.*;

public class SwingCalculator extends JFrame implements ActionListener
{
	private JLabel l1,l2,l3,l4;
    private JTextField t1,t2,t3;
    private JButton b1,b2,b3;
    private int x,y,z;
    private JPanel[] p; //pannel array
    private JComboBox cb;
    
    public SwingCalculator() 
    {
    	super("CALCULATOR"); //jFrame er constructor ke call korche, constructor er modhey-er string ta title bar e dekhai
    	String[] sgn={"+","-","*","/"};
    	cb=new JComboBox(sgn);
    	
        l1=new JLabel("1st  no :  "); /*jFrame windows application, eta swing diye kora hoi, browser diye na*/
        l2=new JLabel("2nd no :  ");
        l3=new JLabel("Result");
        l4=new JLabel("Sign");
        
        t1=new JTextField(20);
        t2=new JTextField(20);
        t3=new JTextField(20);
        b1=new JButton("OK");
        b2=new JButton("RESET"); 
        b3=new JButton("CANCEL");
       		
        p=new JPanel[5]; 
        for(int i=0;i<p.length;i++)
        {
             p[i]=new JPanel();
        }
       	p[0].setLayout(new GridLayout(1,2,20,20));	    	
       	p[0].add(l1);
       	p[0].add(t1);
       	
       	p[1].setLayout(new GridLayout(1,2,20,20));	// 1 row 2 col, hor gap, vert gap 
       	p[1].add(l2);
       	p[1].add(t2);
       	
        p[2].setLayout(new GridLayout(1,2,20,20));     	
        p[2].add(l3);
       	p[2].add(t3);
       	
        p[3].setLayout(new GridLayout(1,2,20,20));      	
        p[3].add(l4);
       	p[3].add(cb);       	
        
        p[4].setLayout(new GridLayout(1,3,20,20));        	
       	p[4].add(b1);
       	p[4].add(b2);
       	p[4].add(b3);
       	
       	
       	Container c=getContentPane();
       	c.setLayout(new GridLayout(5,3,10,10));
       	for(int i=0;i<p.length;i++)
       	  c.add(p[i]);
        
          
        b1.addActionListener(this);	
       	b2.addActionListener(this);
       	b3.addActionListener(this);
       	
       	setBackground(Color.cyan);
       	setResizable(false);	//resize can't be done	
       	setSize(400,200);
       	setVisible(true);	
    }


    
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==b1)
    	{ 	
    	x=Integer.parseInt(t1.getText());
    	y=Integer.parseInt(t2.getText());
        if(cb.getSelectedIndex()==0)
    	   z=x+y;
    	else if(cb.getSelectedIndex()==1) //combo box selection
    	   z=x-y;
    	else if(cb.getSelectedIndex()==2)
    	   z=x*y;
    	else if(cb.getSelectedIndex()==3)
    	{
    		if(y==0)
    		{
    			JOptionPane.showMessageDialog(null,"ERROR: Divided by zero");
    		}
    		else
    		{
    			z=x/y;
    		}
    	}  
    	t3.setText(String.valueOf(z));
    	
    	}
    	
    	else if(e.getSource()==b2)
    	{
    		t1.setText("");
    		t2.setText("");    		
    		t3.setText("");    	
    		cb.setSelectedIndex(0);		
    		z=0;
    	}
    	
    	else if(e.getSource()==b3)
    	{
    		System.exit(0);
    	}
    }   
    public static void main (String[] args) 
    {
    	SwingCalculator ob=new SwingCalculator();
    }
}