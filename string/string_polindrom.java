
import java.util.*;
/* a string is polindrome or not */

   class string_polindrom
 {
 public static void main(String ar[])
    {
    Scanner S= new Scanner(System.in);

System.out.println("Enter a string =");
     String St=S.nextLine();
     int i,j,count,present=0;
     count=St.length();
      St=St.toUpperCase();
	  char ch,k;

   for( i=0,j=count; i<j; i++,j--)
   {
    ch=St.charAt(i);
	k=St.charAt(j);
 if(ch!=k)
   {
 present=1;
   }
   }

   if (present==0) 
    {
System.out.println("polindrome");
    }
  else
   {
  System.out.println(" not polindrome");
    }
  }
}