import java.util.*;
  class array_test_search
  {
public static void main(String ar[])
   {
  Scanner S=new Scanner(System.in);
    System.out.println("Enter size of array=");
   int si =S.nextInt();
  int a[]=new int[si];
  System.out.println("Enter "+si+ " nobs for find greatest value=");
   int i,present=0;
  
   for( i=0;i<si;i++)
    {
    a[i]=S.nextInt();
    }

  System.out.println("Enter a search number=");
   int sr=S.nextInt();
  
   for( i=0;i<si;i++)
    { 
    
      if(a[i]==sr)
       {
       present=1;
       }
    }
   if( present==1)
    {
   System.out.println(sr+"  found " ); 
    }
   else
     {
    System.out.println(sr+"  for not found " ); 
    }
    } 
  }
