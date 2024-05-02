import java.io.*;
   class string_indexof
 {
 public static void main(String ar[]) throws IOException
    {
    DataInputStream DIS= new DataInputStream(System.in);

System.out.println("Enter a string =");
     String S=DIS.readLine();
   System.out.println("Enter charecter for find index=");
    char ch=(char)DIS.read();
	int y=S.indexOf(ch);
 
System.out.println("Find index of a charector  in a string ="+y);        
 
  }
}