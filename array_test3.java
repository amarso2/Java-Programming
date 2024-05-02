import java.util.*;
  class array_test3
  {
public static void main(String ar[])
   {
  Scanner S=new Scanner(System.in);
    System.out.println("Enter size of array=");
   int si =S.nextInt();
  int a[]=new int[si];
  System.out.println("Enter "+si+ " nobs for find greatest value=");
   int i,sm,gr;
  
   for( i=0;i<si;i++)
    {
    a[i]=S.nextInt();
    }

   gr=sm=a[0];
   for( i=0;i<si;i++)
    { 
    
      if(a[i]<sm)
       {
       sm=a[i];
       }
	   else
	   {
	   gr=a[i];
	   }
    }
   System.out.println("smallest value="+sm+"\n greatest="+gr); 
    } 
  }
