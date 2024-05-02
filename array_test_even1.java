import java.util.*;

  class array_test_even1
  {
public static void main(String ar[])
   {
  Scanner S=new Scanner(System.in);
    System.out.println("Enter size of array=");
   int si =S.nextInt();
  int a[]=new int[si];
  System.out.println("Enter "+si+ " nobs for find greatest value=");
   int i,ecount=0,ocount=0,eadd=0,oadd=0;
  
   for( i=0;i<si;i++)
    {
    a[i]=S.nextInt();
    }

  
   for( i=0;i<si;i++)
    { 
     
      if( a[i]%2==0)
    {
     eadd=eadd+a[i];
    ecount=ecount+1;
     }
   else
     { 
      oadd=oadd+a[i];
    ocount=ocount+1; 
    }
  }
System.out.println("Addition of even nobs="+eadd+ " \nCount of even nobs=" +ecount );
   
 
   System.out.println("Addition of odd nobs="+oadd+ "\n Count of odd nobs=" +ocount );
    


    } 
    } 