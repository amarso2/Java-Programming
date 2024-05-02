import java.io.*;
   class string_length
 {
 public static void main(String ar[]) throws IOException
    {
    DataInputStream DIS= new DataInputStream(System.in);

System.out.println("Enter a string =");
     String S=DIS.readLine();
   int count=S.length();
 
System.out.println("Availeble charector of a string ="+count);        
 
  }
}