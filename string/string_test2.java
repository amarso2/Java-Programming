import java.io.*;
   class string_test2
 {
 public static void main(String ar[]) throws IOException
    {
    DataInputStream DIS= new DataInputStream(System.in);

System.out.println("Enter a string =");
     String S=DIS.readLine();
   S=S.toLowerCase();
 
System.out.println("string ="+S);        
 
  }
}