import java.io.*;
import java.util.*;
   class string_indexofpos
 {
 public static void main(String ar[]) throws IOException
    {
    DataInputStream DIS= new DataInputStream(System.in);
	Scanner s=new Scanner(System.in);

System.out.println("Enter a string =");
     String S=DIS.readLine();
   System.out.println("Enter charecter and postion for find index=");
    char ch=(char)DIS.read();
	int pos=s.nextInt();
	int y=S.indexOf(ch,pos);
	
 
System.out.println("Find index of a charector  in a string ="+y);        
 
  }
}