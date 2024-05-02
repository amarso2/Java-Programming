import java.util.*;
 class Addition
  {
   int r;
    void get(int r)
	 {
	  float ar=(float)(3.14*r*r);
	  System.out.println("Area of circle="+ar);
	   }
	    void get(float s)
		 {
		  float ar=(float)(s*s);
		  System.out.println("Area of square="+ar);
		 }
		 void get(float b,float h)
		 {
		  float ar=(float)(0.5*b*h);
		  System.out.println("Area of triangle="+ar);
		 }
		 void get(int l,int b)
		 {
		  float ar=(float)(l*b);
		  System.out.println("Area of rectangle="+ar);
		 }
	}
	
	class polimer_area
	 {
	  public static void main(String ar[])
	   {
	     Scanner s=new Scanner(System.in);
		 
		 System.out.println("Enter redius of circle=");
		  int r=s.nextInt();
		  System.out.println("Enter a side of square=");
		  float sd=s.nextFloat();
		  System.out.println("Enter base and height of triange=");
		  float bs=s.nextFloat();
		  float h=s.nextFloat();
		  System.out.println("Enter lenght and breadthof rectangle=");
		   int l=s.nextInt();
		   int br=s.nextInt();
		   Addition Ad=new Addition();
		    Ad.get(r);
			Ad.get(sd);
			Ad.get(bs,h);
			Ad.get(l,br);
		}
	}
		  