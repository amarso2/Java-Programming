import java.util.*;
   class string_textl
 {
 public static void main(String ar[])
    {
	Scanner s=new Scanner(System.in);
String St[]=new String[4];
int i,sz;
 
System.out.println("Enter 4 string =");
   for( i=0;i<4;i++)
       {
      St[i]=s.nextLine();
	   }
   System.out.println("print 4 string=");
     for(  i=0;i<4;i++)
	  {
	   sz=St.length;
	  System.out.println(St[i]+"\t"+sz);
	  }        
 
  }
}