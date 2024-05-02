
import java.util.*;
/* print a string charecter by charecter*/

 class string_charecter
 {
 public static void main(String ar[])
    {
    Scanner S= new Scanner(System.in);

System.out.println("Enter a string =");
     String St=S.next();
     int count=St.length();
   for(int i=0; i<count; i++)
     {
System.out.print(St.charAt(i)+"\t");     
     }
      }
}