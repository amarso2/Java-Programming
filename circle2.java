import java.io.*;
   class circle2
 {
 public static void main(String ar[]) throws IOException
    {
InputStreamReader ISR=new InputStreamReader(system.in);
BufferedReader BR = new BufferedReader(ISR);
System.out.println("Enter radius of circle =");
float r=Float.parseFloat(BR.readLine());
double a=3.14*r*r; 
double c=2*3.14*r;
System.out.println("Area="+a+"\ncircumfrance="+c);
  }
}