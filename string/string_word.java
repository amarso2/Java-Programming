
import java.util.*;
/* found number of word in a string */

   class string_word
 {
 public static void main(String ar[])
    {
    Scanner S= new Scanner(System.in);

System.out.println("Enter a string =");
     String St=S.nextLine();
char ch;
     int i,count,spcount=0;
     count=St.length();
      St=St.toUpperCase();

   for( i=0; i<count; i++)
   {
    ch=St.charAt(i);
    
 if(ch==' ')
   {
 spcount=spcount+1;
   }
   }
  System.out.println(" number of word in a string=" +(spcount +1));
    
  }
}