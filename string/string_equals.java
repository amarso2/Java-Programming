import java.io.*;
   class string_equals
 {
 public static void main(String ar[]) throws IOException
    {
    DataInputStream DIS= new DataInputStream(System.in);

System.out.println("Enter 1st string =");
     String S=DIS.readLine();
System.out.println("Enter 2st string =");
     String S1=DIS.readLine();
   if(S.equals(S1))
     { 
 
System.out.println("Both strings are equals");        
   }
  else
   {
   System.out.println("Both strings are not equals");
   }
 }
   
}