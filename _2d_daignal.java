import java.util.*;

  class _2d_daignal
  {
public static void main(String ar[])
   {
  Scanner S=new Scanner(System.in);
    System.out.print(" Enter rows and cloumns=\t"); 
   int r=S.nextInt();
   int c=S.nextInt();
    
  int a[][]=new int[r][c];
  System.out.println("Enter element of matrix=");
   int i,j;
  
   for( i=0;i<r;i++)
    {
     for( j=0;j<c;j++)
    {

    a[i][j]=S.nextInt();
    }
  }
  //code of 1st diagnal
  System.out.println("1st daignal values=");
  
   for( i=0;i<r;i++)
    { 
     for( j=0;j<c;j++)
    { 
    if(i==j)
     { 
   
     System.out.print(a[i][j]);  
    }
  System.out.print("\t");
       }
     System.out.println();
    } 
	
	System.out.println("2nd diagnal matrix=");
	for( i=0;i<r;i++)
    { 
     for( j=0;j<c;j++)
    { 
    if((i+j)==(3-1))
     { 
   
     System.out.print(a[i][j]);  
    }
  System.out.print("\t");
       }
     System.out.println();
    }

    } 
    }   