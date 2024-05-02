import java.io.*;
  class Input1 
   {
     float p;
	    Input1(float a)
	     {
		   p=a;
		  }
	}
	 
    class input2 extends Input1
   {
     float r;
	   input2(float a ,float b )
	     {
		 super(a);
		   r=b;
		  }
	}
		class Input3 extends intrest2
		{ 
		  float t;
		  Input3(float a,float b,float c)
		   {
		    super(a,b);
			 t=c;
			}
			 void calculate()
			 {			 
			   float s;
			    s=(float)(p+r+t)/2;
				 float ar=(float)(Math.sqrt(s*(s-p)*(s-r)*(s-t)));
				 System.out.println("Area of triangle="+ar);
			  }
		}
		  
  
     class inhrit_cons1_area
      {
         public static void main(String ar[])throws IOException
            {
             DataInputStream	DIS=new DataInputStream(System.in);
             System.out.println("Enter three side of triangle=");
              float a=Float.parseFloat(DIS.readLine());
              float b=Float.parseFloat(DIS.readLine());
			  float c=Float.parseFloat(DIS.readLine());
               Input3 ob=new Input3(a,b,c);
                ob.calculate();
             }
        }			 