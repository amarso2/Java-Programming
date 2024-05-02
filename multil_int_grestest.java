import java.util.*;
interface list1
  {
  void get();
  }
  interface list2 extends list1
   {
   void find();
   }
   interface list3 extends list2
    {
   void put();
   }
   
    class Greatest implements list3 
	{
	Scanner s= new Scanner(System.in);
	   int y,x,z,gr;
	    public void get()
		 {
		 System.out.println("Enter two number=");
		 x=s.nextInt();
		 y=s.nextInt();
		 z=s.nextInt();
		 }
		 public void find()
		  {
		  if(x>y)
		     {
			 if(x>z) 
			   {
			   gr=x;
			   }
			   else
			    {
				gr=z;
				}
			  }
			  else 
			     {
				 if(y>z)
				   {
				   gr=y;
				   }
				  else 
				    {
					gr=z;
					}
				  }
			}
	
		  public void put()
		   {
		   System.out.println("greatest="+gr);
		   }
    }
	
	class multil_int_grestest
	  {
	  public static void main(String ar[])
	     {
		 Greatest r=new Greatest();
		   list3 ob=r;
		   ob.get();
		   ob.find();
		   ob.put();
		   }
	   }