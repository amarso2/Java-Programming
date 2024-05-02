import java.util.*;

class  vector_int
 {
   public static void main(String ar[])
    {
	int len = ar.length;
	Vector v= new Vector();
	for( int i=0; i<len; i++)
	  {
	  Integer IT=new Integer(ar[0]);
	  
	  v.addElement(IT);
	  }
	  System.out.println("vector="+v);
	 }
   }