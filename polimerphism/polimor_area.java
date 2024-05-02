 import java.util.*;
  class addition
  {
   void cal(float rd)
     {
	 float ar= (float)(3.14*rd*rd);
	 System.out.println("Area of circle="+ar);
	 }
	 void cal(int x)
	  {
       int ar=x+x;
       	 System.out.println("area of square="+ar);
       }
      void cal(float ln, float br)
        {
        float  ar=ln*br;
       		 System.out.println("area of rectangle="+ar);
		}
		void cal(double ln, double h)
        {
        double ar=ln*h/2;
       		 System.out.println("area of triangle="+ar);
		}
		
	}
	
	 class polimor_area
	   {
	    public static void main(String ar[])
		  {
		  Scanner s=new Scanner(System.in);
		   System.out.println("Enter redius of circle =");
		    float r =s.nextFloat();
			System.out.println("Enter side of square=");
		      int a =s.nextInt();
			   
			  System.out.println("Enter lenght and breadth of rectangle =");
		      float l =s.nextFloat();
			  float b =s.nextFloat();
			    System.out.println("Enter lenght and height of triangle =");
		      double ln =s.nextDouble();
			  double h =s.nextDouble();
			  
			  
			   addition ob=new addition();
			    ob.cal(r);
				ob.cal(a);
				ob.cal(l,b);
				ob.cal(ln,h);
			}
		}
   
	 