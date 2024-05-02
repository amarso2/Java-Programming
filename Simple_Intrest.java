 import java.util.*;
   class principle
     {
	  Scanner  s=new Scanner(System.in);
	   float p,r,t,si;
	    void get()
		{
	   System.out.println("Enter value of principle,rate and time=");
	     p=s.nextFloat();
	     r=s.nextFloat();
     	 t=s.nextFloat();		 
		 }
	  }
   	  
	  class Rate_time extends principle
	     {
             void calculate()
               {
                si=(float) (p*r*t/100);
               }
             void dip()
                 {
                  System.out.println("Simple Intrest="+si);
                 }
           }
        
             class Simple_Intrest
               {
                public static void main(String ar[])
                 {
                 Rate_time rt=new Rate_time();
                   rt.get();
                   rt.calculate();
                    rt.dip();
                  }
                }				  
				 