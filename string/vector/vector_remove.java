import java.util.*;
   class vector_remove
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

 System.out.println("Enter remove object =");
  String  st1=S.nextLine();
        v.removeElement(st1); 
 System.out.println("no of object ="+v);
  }
}