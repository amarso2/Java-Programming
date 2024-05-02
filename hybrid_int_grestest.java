import java.util.*;
interface list1
  {
  void get1();
  }
  interface list2 extends list1
   {
   void get2();
   }
   
   interface list3
   {
   void find();
   }
   
   interface list4 extends list2,list3
    {
   void put();
   }
   
    class Greatest implements list4
	{
	Scanner s= new Scanner(System.in);
	   int y,x,z,gr;
	    public void get1()
		 {
		 System.out.println("Enter three number=");
		 x=s.nextInt();
		 }
		 public void get2()
		 {
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
	
	class hybrid_int_grestest
	  {
	  public static void main(String ar[])
	     {
		 Greatest r=new Greatest();
		   list4 ob=r;
		   ob.get1();
		   ob.get2();
		   ob.find();
		   ob.put();
		   }
	   }