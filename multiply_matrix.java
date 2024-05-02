import java.util.*;

  class multiply_matrix
  {
public static void main(String ar[])
   {
  Scanner S=new Scanner(System.in);
  System.out.println("Enter 1st matrix of rows and cloumns="); 
   int r1=S.nextInt();
   int c1=S.nextInt();
 System.out.println("Enter 1st matrix of rows and cloumns="); 
   int r2=S.nextInt();
   int c2=S.nextInt();
    
  if(c1==r2)
   {
    
  int a[][]=new int[r1][c1];
  int b[][]=new int[r2][c2];
  int mult[][]=new int[r1][c2];
     
  System.out.println("Enter element of 1st matrix=");
   int i,j,k,add;
  
   for( i=0;i<r1;i++)
    {
     for( j=0;j<c1;j++)
    {

    a[i][j]=S.nextInt();
    }
  }
  
  System.out.println("Enter element of 2nd matrix=");
     for( i=0;i<r2;i++)
    {
     for( j=0;j<c2;j++)
    {

    b[i][j]=S.nextInt();
    }
  }
   
    System.out.println("1st matrix=");
     for( i=0;i<r1;i++)
    {
     for( j=0;j<c1;j++)
    {
    System.out.print(a[i][j]+"\t");
    }
   System.out.println();
  }
   


   System.out.println("2nd matrix=");
     for( i=0;i<r2;i++)
    {
     for( j=0;j<c2;j++)
    {
    System.out.print(b[i][j]+"\t");
    }
   System.out.println();
  }



   for( i=0;i<r1;i++)
    { 
     for( j=0;j<c2;j++)
    { 
add=0;
    for( k=0;k<r2;k++)
    { 
    
  add=add+a[i][k]*b[k][j];
       }
    mult[i][j]=add;
     
    }
   }
 System.out.println("Addition of two matrix\n");
     for( i=0;i<r1;i++)
    {
     for( j=0;j<c2;j++)
    {

    System.out.print(mult[i][j]+"\t");
    }
 System.out.println();
  }
 } 
   else
   { 
  System.out.println("Invailed rows ana columns for finding multiply");
    }

    } 
    }   