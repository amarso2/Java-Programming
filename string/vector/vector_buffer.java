import java.io.*;
import java.util.*;

   class vector_buffer
 {
 public static void main(String ar[]) throws IOException
 
    {
    BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
	 Vector v= new Vector();
	 String st[]= new String[3];
	   

System.out.println("Enter 3 string =");
for(int i=0; i<3; i++)
      {
      st[i]=BR.readLine();
	  v.addElement(st[i]);
	   }
   
 
System.out.println("string ="+v);

System.out.println("Enter position for find object of vector=");
int pos= Integer.parseInt(BR.readLine());           
 System.out.println("string ="+v.elementAt(pos));
  }
}