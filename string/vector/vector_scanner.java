import java.util.*;
   class vector_scanner
 {
 public static void main(String ar[])
    {
    Scanner S= new Scanner(System.in);
	 Vector v= new Vector();
	 String st[]= new String[20];
	   

System.out.println("Enter 20 string =");
for(int i=0; i<20; i++)
      {
      st[i]=S.nextLine();
	  v.addElement(st[i]);
	   }
   
 
System.out.println("string ="+v);        
 
  }
}