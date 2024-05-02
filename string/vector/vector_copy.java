import java.util.*;
class vector_copy
  {
  public static void main(String ar[])
   {
   int len=ar.length;
   Vector v=new Vector();
   int i;
   for(i=0;i<len ; i++)
     {
	 v.addElement(ar[i]);
	 }
	 System.out.println("String="+v);
	 
	 v.insertElementAt("HTML",3);
	 v.insertElementAt("java script",2);
	 
	 int sz=v.size();
	 String s[]=new String[sz];
	 v.copyInto(s);
	 for( i=0;i<sz ; i++)
	    {
		System.out.println(s[i]+"\t");
		}
	 }
	}
