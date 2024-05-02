import java.util.*;
  class base
   {
    void show()
	  {
	  System.out.println("Base calss");
	  }
	}
	
	class derive extends base 
	  {
	     void show()
		  {
		   System.out.println("Derive class");
		   }
		   void disp()
		    {
			show();
			super.show();
			}
	  }
	  
	  class poli_overrinding
	    {
		 public static void main(String ar[])
		    {
			derive D=new derive();
			   D.disp();
			 }
			 
	     }
		 