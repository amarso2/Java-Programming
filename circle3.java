import java.io.*;
class circle3
 {
  public static void main(String ar[]) throws IOException
    {
    DataInputStream DIS= new DataInputStream(System.in);
    
   System.out.println("enter redius=");
float r=Float.parseFloat(DIS.readLine());
  float  a=(float)3.14*r*r;
  float  cir=2*(float)3.14*r;
  
   System.out.println("Area of circle ="+a+"\nperimeter of circle"+cir);
     }
   }