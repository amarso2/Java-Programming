import java.util.*;
class vector_comma
  {
  public static void main(String ar[])
   {
   int len=ar.length;
   Vector v=new Vector();
   for(int i=0;i<len ; i++)
     {
	 v.addElement(ar[i]);
	 }
	 System.out.println("String="+v);
	}
  }