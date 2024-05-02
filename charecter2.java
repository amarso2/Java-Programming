import java.io.*;
class charecter2
 {
  public static void main(String ar[]) 
    {
     InputStreamReader ISR=new InputStreamReader(System.in);
       BufferedReader BR = new BufferedReader(ISR);
  char ch= (char) BR.read();
      ch=string.toUpperCase(ch);
 if(ch>=65&&ch<=90 ||ch>=97&&ch<=122)
    {
      
    switch(ch) 
       {
      
       case 'A': 
        case 'E': 
       
         case 'I': 
         case 'O': 
         case 'U':
                    System.out.println("vowel");
                     break;
          
          
        default: System.out.println("cansonent");
       }
}
   else
 {System.out.print(" not alphabet");
}
     }
   }