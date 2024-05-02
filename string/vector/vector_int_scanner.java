import java.util.*;

class  vector_int_scanner
 {
   public static void main(String ar[])
    {
	Scanner s=new Scanner(System.in);
	
	int len = ar.length;
	Vector v= new Vector();
	int IT;
	for( int i=0; i<len; i++)
	  {
	  
	   IT=s.nextInt();
	  
	  v.addElement(IT);
	  }
	  System.out.println("vector="+v);
	 }
   }