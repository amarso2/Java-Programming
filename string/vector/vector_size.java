import java.util.*;
   class vector_size
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

 
 int count = v.size(); 
 System.out.println("no of object ="+count);
  }
}