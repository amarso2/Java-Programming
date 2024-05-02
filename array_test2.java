import java.util.*;
  class array_test2
  {
public static void main(String ar[])
   {
  Scanner S=new Scanner(System.in);
 System.out.println("Enter size=");
  int si=S.nextInt();
  
  int a[]=new int[si];
  System.out.println("Enter " +si+ " nobs");

 for(int i=0;i<si;i++)
    {
   a[i]=S.nextInt();
    }
  for(int i=0;i<si;i++)
    { 
    System.out.println(a[i]+"\t");

    }
}}
