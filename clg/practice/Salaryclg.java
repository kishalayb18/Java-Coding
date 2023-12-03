class Sal
{
          double b,da,hra,ma;
          Sal()
          {
                 b=0;
          }
          
          Sal(double z)
          {
                 b=z;
                 System.out.println("Basic Salary = "+b); 

          }

          double reg(double z)

          {
                 b=z;
                 da=b*(15.0/100);
                 hra=b*(12.0/100);
                 ma=b*(0.5/100);
                 double regsal=b+da+hra+ma;
                 System.out.println("Regular Sal="+regsal);  
                 return regsal;
           }
}

/*****************************************************************************/

class Sci extends Sal
{
       Sci()
       {
           System.out.println("");
           System.out.println("SCIENTIST");
       }
       Sci(double a)
       {
             super(a);
       }

       void netsci(double a,int i)
       {
             int pub=1500;
             int pub_bon=pub*i;
             //double r=reg(a);
             double net_sci=reg(a)+pub_bon;
             System.out.println("No. of publication:"+i);
             System.out.println("Bonus/Publication:"+pub);
             System.out.println("Net Salary:"+net_sci);
       }
}

/*****************************************************************************/

class Lead extends Sal
{

       Lead()
       {
           System.out.println("");
           System.out.println("PROJECT LEADER");
       }
       Lead(double a)
       {
             super(a);
       }

       void netpro(double a,int i)
       {
             int pro=1200;
             int pro_bon=pro*i;
             double netpro=reg(a)+pro_bon;
             System.out.println("No. of Project:"+i);
             System.out.println("Bonus/Project:"+pro);
             System.out.println("Net Salary:"+netpro);
       }
}

/*****************************************************************************/

class Dev extends Sal
{

       Dev()
       {
           System.out.println("");
           System.out.println("DEVELOPER");
       }
       Dev(double a)
       {
             super(a);
       }

       void netdev(double a,int i)
       {
             int pat=800;
             int dev_bon=pat*i;
             double net_dev=reg(a)+dev_bon;
             System.out.println("No. of Patent:"+i);
             System.out.println("Bonus/Patent:"+pat);
             System.out.println("Net Salary:"+net_dev);
       }
}

/*****************************************************************************/

class Salaryclg
{
      public static void main(String [] args)
      {
       double a=Double.parseDouble(args[0]);
       double m=Double.parseDouble(args[1]);
       double x=Double.parseDouble(args[2]);
       int b=Integer.parseInt(args[3]);
       int n=Integer.parseInt(args[4]);
       int y=Integer.parseInt(args[5]);

       Sci s1=new Sci();
       Sci s2=new Sci(a);
       s2.netsci(a,b);

       Lead k1=new Lead();
       Lead k2=new Lead(m);
       k2.netpro(m,n);

       Dev d1=new Dev ();
       Dev d2=new Dev (x);
       d2.netdev(x,y);
       
      }
}
  
           