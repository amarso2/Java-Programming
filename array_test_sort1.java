import java.util.*;
  class array_test_sort1
  {
public static void main(String ar[])
   {
  Scanner S=new Scanner(System.in);
    System.out.println("Enter size of array=");
   int si =S.nextInt();
  int a[]=new int[si];
  System.out.println("Enter "+si+ " nobs for find greatest value=");
   int i,j,temp;
  
   for( i=0;i<si;i++)
    {
    a[i]=S.nextInt();
    }

  
   for( i=0;i<si;i++)
    { 
     
   for( j=i+1;j<si;j++)
    { 
      if( a[i]<a[j])
    {
     temp= a[i];
      a[i]=a[j];
     a[j]= temp;
     } 
      
    }
  }
System.out.println("sorting nobs");
   
   for( i=0;i<si;i++)
    {
   System.out.println(a[i]);
    }


    } 
  }