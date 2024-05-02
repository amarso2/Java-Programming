import java.util.*;

  class _2d_Addition
  {
public static void main(String ar[])
   {
  Scanner S=new Scanner(System.in);
   
    
  int a[][]=new int[4][3];
  int b[][]=new int[4][3];
  int add[][]=new int[4][3];
  System.out.println("Enter element of 1st matrix=");
   int i,j;
  
   for( i=0;i<4;i++)
    {
     for( j=0;j<3;j++)
    {

    a[i][j]=S.nextInt();
    }
  }
  
  System.out.println("Enter element of 2nd matrix=");
     for( i=0;i<4;i++)
    {
     for( j=0;j<3;j++)
    {

    b[i][j]=S.nextInt();
    }
  }
   
    System.out.println("1st matrix=");
     for( i=0;i<4;i++)
    {
     for( j=0;j<3;j++)
    {
    System.out.print(a[i][j]+"\t");
    }
   System.out.println();
  }
   


   System.out.println("2nd matrix=");
     for( i=0;i<4;i++)
    {
     for( j=0;j<3;j++)
    {
    System.out.print(b[i][j]+"\t");
    }
   System.out.println();
  }



   for( i=0;i<4;i++)
    { 
     for( j=0;j<3;j++)
    { 
    
  add[i][j]=a[i][j]+b[i][j];
       }
     
    }
   
 System.out.println("Addition of two matrix\n");
     for( i=0;i<4;i++)
    {
     for( j=0;j<3;j++)
    {

    System.out.print(add[i][j]+"\t");
    }
 System.out.println();
  }

    } 
    }   