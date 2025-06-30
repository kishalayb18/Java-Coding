
interface Bank
{ 
    float rateOfInterest(); //float is the return type here //method declaration with no method definition
}

interface PostOffice
{
	float postOfficeInterest();
}

class SBI implements Bank, PostOffice//MULTIPLE INHERITANCE VIA INTERFACE, TAKING 2 interfaces inside a single class
{ 
	@Override //this is an annotation, it makes the compiler understand more specificly that the method is overriden, it is optional
    public float rateOfInterest()	//the public key word is MANDATORY WHILE DEFINING the interface methods, else it'll throw error
    {
    	System.out.println("This is SBI BANK");
        return 9.15f;
    }
    
    @Override
    public float postOfficeInterest()	
    {
    	System.out.println("This is SBI POST OFFICE");
        return 6.36f;
    }
} 
class PNB implements Bank
{ 
	@Override
    public float rateOfInterest()
    {
        return 9.7f;
    }
         
} 
class TestInterface2
{
    public static void main(String[] args)
    { 
        SBI ob=new SBI(); 
        System.out.println("ROI: "+ob.rateOfInterest()); //Output: ROI: 9.15
        System.out.println("ROI: "+ob.postOfficeInterest()); //Output: ROI: 6.36
        
        Bank bank_Obj=new SBI(); //Dynamic Method Dispatch //Super Class type refference=sub class type object
        System.out.println("ROI: "+bank_Obj.rateOfInterest()); //Output: ROI: 9.15
        
        //ERROR 
        System.out.println("ROI: "+bank_Obj.postOfficeInterest());//As Bank interface doesn't have postOfficeInterest method
        													// and bank_Obj is a reference of Bank Interface,
        													// so we can't call postOfficeInterest method using bank_Obj
        													
        													
        PostOffice post_obj=new SBI(); //Dynamic Method Dispatch //Super Class type refference=sub class type object
        
        //ERROR 
        System.out.println("ROI: "+post_obj.rateOfInterest());//As PostOffice interface doesn't have rateOfInterest method
        													// and post_obj is a reference of PostOffice Interface,
        													// so we can't call rateOfInterest method using post_obj
        System.out.println("ROI: "+post_obj.postOfficeInterest());//Output: ROI: 6.36
        
        
        Bank ob1=new PNB();//Dynamic Method Dispatch
        System.out.println (ob1.rateOfInterest());
        
    }
} 