import Store.*;

 import java.util.*;
 
   class Triangle implements List1
    {
	Scanner Sc=new Scanner(System.in);
	 float b,h;
	 double a;
	 public void input()
	  {
	  System.out.println("Enter base and height=");
	   b=Sc.nextFloat();
	   h=Sc.nextFloat();
	   }
	   public void process()
	     {
		 a=0.5*b*h;
		 }
		 public void out()
		  {
		  System.out.println("Area of triangle="+a);
		  }
		}
		class  inter_Triangle
		  {
		  public static void main(String ar[])
		     {
			  Triangle ob=new Triangle();
			   ob.input();
			   ob.process();
			   ob.out();
			   }
		    }
   