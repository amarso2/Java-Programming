import java.io.*;
   class string_cancatenate
 {
 public static void main(String ar[]) throws IOException
    {
    DataInputStream DIS= new DataInputStream(System.in);

System.out.println("Enter 1st string =");
     String S=DIS.readLine();
  System.out.println("Enter 2nd string =");
     String S1=DIS.readLine();

  String S3=S.concat(S1);
 
System.out.println("string ="+S3);        
 
  }
}