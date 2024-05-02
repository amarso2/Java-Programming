import java.io.*;
   class string_replace
 {
 public static void main(String ar[]) throws IOException
    {
    DataInputStream DIS= new DataInputStream(System.in);

System.out.println("Enter a string =");
     String S=DIS.readLine();
   System.out.println("Enter replace and with charector =");
   char x=(char) DIS.read();
 char y=(char) DIS.read();
 String S1=S.replace(x,y);

System.out.println("string ="+S1);        
 
  }
}