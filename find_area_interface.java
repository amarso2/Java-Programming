
import java.util.*;
 interface list
  {
   void get();
   void area();
   void put();
  }
  
   class Rectangle implements list
     {
	 Scanner S=new Scanner(System.in);
	 int l,b,ar;
	public void get()
	   {
	   System.out.println("Enter lenght and breadth of rectangle=");
	   l=S.nextInt();
	   b=S.nextInt();
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
   
    class Triangle implements list
     {
	 Scanner S=new Scanner(System.in);
	 float l,h,ar;
	public void get()
	   {
	   System.out.println("Enter lenght and height of Triangle=");
	   l=S.nextFloat();
	   h=S.nextFloat();
	    }
	 public void area()
	    {
		ar=(float)(0.5*l*h);
		}
	 public void put()
	     {
		 System.out.println("Area of rectangle="+ar);
		 }
	  }
	  
	 class Circle implements list
     {
	 Scanner S=new Scanner(System.in);
	 float r,ar;
	 public void get()
	   {
	   System.out.println("Enter redius of circle=");
	   r=S.nextFloat();
	    }
	 public void area()
	    {
		ar=(float)(3.14*r*r);
		}
	 public void put()
	     {
		 System.out.println("Area of rectangle="+ar);
		 }
	  }
	  
	  class find_area_interface
	    {
		public static void main(String ar[])
		   {
		   Rectangle R=new Rectangle();
		   list ob=R;
		   ob.get();
		   ob.area();
		   ob.put();
		   
		   Triangle T=new Triangle();
		   ob=T;
		   ob.get();
		   ob.area();
		   ob.put();
		   
		   Circle C=new Circle();
		   ob=C;
		   ob.get();
		   ob.area();
		   ob.put();
		   }
		}   
		
    