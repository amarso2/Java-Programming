import java.util.*;
  class base
   {
   Scanner Sc=new Scanner(System.in);
    void area()
	  {
	  System.out.println("Enter lenght and breadth of rectangle=");
	  int l=Sc.nextInt();
	  int b=Sc.nextInt();
	    
	  System.out.println("Area of rectangle="+(l*b));
	  
	  }
	}
	
	class derive extends base 
	  {
    void area()
	  {
	  System.out.println("Enter base and height of triangle=");
	  int b=Sc.nextInt();
	  int h=Sc.nextInt();
	  float ar=(float)(0.5*b*h);
	  System.out.println("Area of rectangle="+ar);
	  
	  }
		   void disp()
		    {
			area();
			super.area();
			}
	  }
	  
	  class rectangle_overrinding
	     {
		 public static void main(String ar[])
		    {
			derive D=new derive();
			   D.disp();
			 }
			 
	     }