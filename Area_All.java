import java.io.*;
   class Area_All
 {
 public static void main(String ar[]) throws IOException
    {
InputStreamReader ISR=new InputStreamReader(System.in);
BufferedReader BR = new BufferedReader(ISR);
System.out.println("Enter your choice =");
 int ch=Integer.parseInt(BR.readLine());

 
switch(ch)
 {
 case 1: System.out.println("Enter redius =");
          float r =Float.parseFloat(BR.readLine());
              float ar=(float)(3.14*r*r;
         System.out.println("Area og circle="+ar);
             break;
 case 2:  System.out.println("Enter your celcius =");  
          
            f=(float)(c*1.8+32);
            System.out.println("farenheit"+f);
              break;
   default: System.out.println("your choice worng");
  }

  }
}