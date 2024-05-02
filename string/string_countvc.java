import java.util.*;
/* a string charecter count vowel and cansonent */

   class string_countvc
 {
 public static void main(String ar[])
    {
    Scanner S= new Scanner(System.in);

System.out.println("Enter a string =");
     String St=S.nextLine();
     char ch;
     int i,scount,vcount=0,ccount=0;
     scount=St.length();
      St=St.toUpperCase();

   for( i=0; i<scount; i++)
   {
   
    ch=St.charAt(i); 
 if(ch>=65&&ch<=90 || ch>=97&& ch<=122)
   {
  if(ch=='A' ||ch =='E'||ch =='I'||ch =='O'||ch =='U')
    { 
   vcount=vcount+1;
     }
  else
    { 
    ccount=ccount+1;
    }
   }
    else
    {
    System.out.print("Not alphabet of the charecter");
    }
   }
System.out.println("count of vowel charecter"+vcount+"\n count of cansonent charecter"+ccount);
  }
}