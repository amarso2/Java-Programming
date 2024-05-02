import java.io.*;
  class array_DIS_search
  {
public static void main(String ar[])throws IOException
   {
  DataInputStream DIS=new DataInputStream(System.in);
    System.out.println("Enter size of array=");
   int si =Integer.parseInt(DIS.readLine());
  int a[]=new int[si];
  System.out.println("Enter "+si+ " nobs for find greatest value=");
   int i,present=0;
  
   for( i=0;i<si;i++)
    {
    a[i]=Integer.parseInt(DIS.readLine());
    }

  System.out.println("Enter a search number=");
   int sr=Integer.parseInt(DIS.readLine());
  
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