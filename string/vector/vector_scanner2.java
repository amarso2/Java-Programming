 import java.util.*;
   class vector_scanner2
 {
 public static void main(String ar[])
    {
    Scanner S= new Scanner(System.in);
	 Vector v= new Vector();
	 String st[]= new String[3];
	   

System.out.println("Enter 3 string =");
for(int i=0; i<3; i++)
      {
      st[i]=S.nextLine();
	  v.addElement(st[i]);
	   }
   
 
System.out.println("string ="+v);

System.out.println("Enter position and object for insert=");
int pos= S.nextInt(); 
 String st1= S.next();  
 v.insertElementAt(st1,pos); 
 System.out.println("string ="+v);
  }
}