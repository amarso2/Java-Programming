import java.util.*;
 class Input
   {
     int x,y;
	 Scanner S=new Scanner(System.in);
     Input()
	  {
	   System.out.println("Enter Two number=");
	    x=S.nextInt();
		y=S.nextInt();
	  }
	 }
	 
	  class swap extends Input
	    {
		  swap()
		    {
			 super();
			  System.out.println("Before swaping value of x="+x+" and also y="+y);
			  int temp=x;
			         x=y;
					 y=temp;
					 System.out.println("After swaping value of x="+x+" and also y="+y);
			}
		}
		
		class inherit_swap
		  {
		   public static void main(String ar[])
		     {
			  swap ob=new swap();
			  }
		   }
		   