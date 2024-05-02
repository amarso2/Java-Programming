import java.util.*;
interface list1
  {
  void get();
  }
  interface list2 extends list1
   {
   void area();
   void put();
   }
   
    class rectangle implements list2 
	{
	Scanner s= new Scanner(System.in);
	   int l,b,ar;
	    public void get()
		 {
		 System.out.println("Enter lenght and breadth of rectangle=");
		 l=s.nextInt();
		 b=s.nextInt();
		 }
		 public void area()
		  {
		  ar=l*b;
		  }
		  public void put()
		   {
		   System.out.println("Area of rectangle="+ar);
		   }
    }
	
	class single_interface
	  {
	  public static void main(String ar[])
	     {
		 rectangle r=new rectangle();
		   list2 ob=r;
		   ob.get();
		   ob.area();
		   ob.put();
		   }
	   }
		 
   