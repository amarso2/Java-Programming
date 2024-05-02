import java.util.*;

class  vector_Float
 {
   public static void main(String ar[])
    {
	Scanner S=new Scanner(System.in);
	
	Vector v= new Vector();
	float IT;
	System.out.println("Enter 5 float number=");
	for( int i=0; i<5; i++)
	  {
	   IT=S.nextFloat();
	  
	  v.addElement(IT);
	  }
	  System.out.println("vector="+v);
	 }
   }