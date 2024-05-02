import java.util.*;
 class data
      {
	    Scanner S= new Scanner(System.in);
		float P,R,T,si;
	   void get()
	     {
	 System.out.println("Enter rate, time and principle=");
      	  R=S.nextInt();
		  T=S.nextInt();
		  P=S.nextInt();
		  }
	   }
	   
	  class data2 extends data  
         {
           void calculate()
              {
                si=P*R*T/100;
               }
            void display()
               {
             System.out.println("Simple intrest="+si);
                }
          }
       class inherit_single_intrest
         {
           public static void main(String ar[])
             {
               data2 Ob= new data2();
                 Ob.get();
                 Ob.calculate();
                 Ob.display();
              }
           }			  