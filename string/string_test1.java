import java.io.*;
   class string_test1
 {
 public static void main(String ar[]) throws IOException
    {
    DataInputStream DIS= new DataInputStream(System.in);

System.out.println("Enter a string =");
     String S=DIS.readLine();
   
 
System.out.println("string ="+S);        

  }
}