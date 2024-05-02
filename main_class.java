 import java.util.*;
  class addition
  {
   int x,y;
   void cal(int x,int y)
     {
	 double sqr=Math.pow(x,y);
	 System.out.println("square of a nob="+sqr);
	 }
	 void cal(int x)
	  {
         double root=Math.sqrt(x);
       	 System.out.println("square root of  a  nob="+root);
       }
      void cal(long x)
        {
       long cube=x*x*x;
       		 System.out.println("cube of a nob="+cube);
		}
		
	}
	
	 class main_class
	   {
	    public static void main(String ar[])
		  {
		  Scanner s=new Scanner(System.in);
		   System.out.println("Enter base and power nob  for find square=");
		    int p =s.nextInt();
			int b =s.nextInt();
			System.out.println("Enter a number for find square root =");
		      int num1 =s.nextInt();
			  
			  System.out.println("Enter a nob =");
		      long num2 =s.nextLong();
			  
			  
			   addition ob=new addition();
			    ob.cal(p,b);
				ob.cal(num1);
				ob.cal(num2);
			}
		}
   
	 