import java.io.*;
import java.util.*;
  class intrest1 
   {
     float p;
	   intrest1(float a)
	     {
		   p=a;
		  }
	}
	 
    class intrest2 extends intrest1
   {
     float r;
	   intrest2(float a ,float b )
	     {
		 super(a);
		   r=b;
		  }
	}
		class intrest3 extends intrest2
		{ 
		  float t;
		  intrest3(float a,float b,float c)
		   {
		    super(a,b);
			 t=c;
			}
			 void calculate()
			 {			 
			 float ci=(float)(p*(Math.pow((1+r/100),t)-1));
			  System.out.println("Compound intrest="+ci);
			  }
		}
		  
  
     class inhrit_compound
      {
         public static void main(String ar[])throws IOException
            {
             DataInputStream	DIS=new DataInputStream(System.in);
             System.out.println("Enter principle ,rate and time=");
              float a=Float.parseFloat(DIS.readLine());
              float b=Float.parseFloat(DIS.readLine());
			  float c=Float.parseFloat(DIS.readLine());
               intrest3 ob=new intrest3(a,b,c);
                ob.calculate();
             }
        }			 