import java.util.*;
import java.io.*;

class  vector_object
 {
   public static void main(String ar[])throws  IOException
    {
	DataInputStream DIS=new DataInputStream(System.in);
	
	Vector v= new Vector();
	String IT;
	System.out.println("Enter 5 number=");
	for( int i=0; i<5; i++)
	  {
	   IT=DIS.readLine();
	  
	  v.addElement(IT);
	  }
	  System.out.println("vector="+v);
	 }
   }