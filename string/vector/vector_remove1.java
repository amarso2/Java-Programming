import java.util.*;
   class vector_remove1
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

 System.out.println("Enter position for remove object =");
   int pos= S.nextInt();
        v.removeElementAt(pos); 
 System.out.println("vector list ="+v);
  }
}