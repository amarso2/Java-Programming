import java.util.*;
 class Addition
  {
    void get(int x,int y)
	 {
	  int add=x+y;
	  System.out.println("Addition of two number="+add);
	   }
	    void get(float p,float r)
		 {
		  float add=(float)(p+r);
		  System.out.println("Addition of two number="+add);
		 }
		 void get(double x,double y)
		 {
		  double add=(x+y);
		  System.out.println("Addition of two number="+add);
		 }
	}
	
	class polimer_add
	 {
	  public static void main(String ar[])
	   {
	     Scanner s=new Scanner(System.in);
		 
		 System.out.println("Enter two integer value=");
		  int x=s.nextInt();
		  int y=s.nextInt();
		  System.out.println("Enter two float value=");
		  float p=s.nextFloat();
		  float r=s.nextFloat();
		  System.out.println("Enter two double value=");
		  double a=s.nextDouble();
		  double b=s.nextDouble();
		   Addition Ad=new Addition();
		    Ad.get(x,y);
			Ad.get(p,r);
			Ad.get(a,b);
		}
	}
		  