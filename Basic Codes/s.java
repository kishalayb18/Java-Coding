public void itemStateChanged(ItemEvent e2)
    {
    	   if(e2.getItem()==c1)
    	   {
    	   	if(e2.getStateChange()==1)
    	   		v1="C";
    	   	else
    	   		v1="";	
    	   }	
   	   if(e2.getItem()==c2)
    	   {
    	   	if(e2.getStateChange()==1)
    	   		v2="C++";
    	   	else
    	   		v2="";	
    	   }	
   	   if(e2.getItem()==c3)
    	   {
    	   	if(e2.getStateChange()==1)
    	   		v3="JAVA";
    	   	else
    	   		v3="";	
    	   }	   	   	   	   	
    	}
    
    
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==b1)
    	{ 	
    	    t1.setText(v1+"  "+v2+"   "+v3);
    	}
    	else if(e.getSource()==b2)
    	{
    		t1.setText("");
    	
    	}
    	else if(e.getSource()==b3)
    	{
    		System.exit(0);
    	}
  
    }