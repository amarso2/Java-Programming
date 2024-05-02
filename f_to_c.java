import java.io.*;
   class f_to_c
 {
 public static void main(String ar[]) throws IOException
    {
InputStreamReader ISR=new InputStreamReader(System.in);
BufferedReader BR = new BufferedReader(ISR);
System.out.println("Enter your choice =");
 int ch=Integer.parseInt(BR.readLine());
float f,c;
 
switch(ch)
 {
 case 1: System.out.println("Enter your fahrenheit =");
          f =Float.parseFloat(BR.readLine());
              c=(float)((f-32)/1.8);
           System.out.println("celcius="+c);
             break;
 case 2:  System.out.println("Enter your celcius =");  
             c =Float.parseFloat(BR.readLine());
            f=(float)(c*1.8+32);
            System.out.println("farenheit"+f);
              break;
   default: System.out.println("your choice worng");
  }

  }
}