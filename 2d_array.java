import java.util.*;

  class _2d_array
  {
public static void main(String ar[])
   {
  Scanner S=new Scanner(System.in);
    
  int a[][]=new int[3][4];
  System.out.println("Enter element of matrix=");
   int i,j;
  
   for( i=0;i<3;i++)
    {
     for( i=0;i<4;i++)
    {

    a[i][j]=S.nextInt();
    }
  }
  
   for( i=0;i<3;i++)
    { 
     for( i=0;i<4;i++)
    { 
     System.out.println(a[i][j]+" \t");  
    }
  System.out.println();
  }

    } 
    } 