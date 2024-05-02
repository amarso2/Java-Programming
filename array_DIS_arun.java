import java.io.*;
  class array_DIS_arun
  {
public static void main(String ar[])throws IOException
   {
  DataInputStream DIS=new DataInputStream(System.in);
    System.out.println("Enter size of array=");
   int si =Integer.parseInt(DIS.readLine());
   if(si>=3)
{
  int a[]=new int[si];
  System.out.println("Enter "+si+ " nobs for search three value=");
  int i;
   for( i=0;i<si;i++)
    {
    a[i]=Integer.parseInt(DIS.readLine());
    }

  System.out.println("Enter three search number=");
   int sr1=Integer.parseInt(DIS.readLine());
  int sr2=Integer.parseInt(DIS.readLine());
   int sr3=Integer.parseInt(DIS.readLine());
    int fadd=0,sadd=0,tadd=0;
	
   for( i=0;i<si;i++)
    { 
    
      if(a[i]==sr1)
	    {
		fadd=fadd+1;
		System.out.print("\t"+a[i]+"\t");
		}
	}
	 if( fadd==0 )
	  {
	  System.out.println(sr1+"not found\n");
	  }
	  else 
	  {
	   System.out.println("\n"+sr1+"  found how many terms= "+fadd+"\n" ); 
	 
	   }
	   
	for(i=0;i<si;i++)
	   {
	   if( a[i]==sr2) 
	        {
			sadd=sadd+1;
			System.out.print("\t"+a[i]);
			}
		}
		if( sadd==0 )
		   {
		   System.out.println(+sr2+"not found\n");
            }
			else 
	       {
		   System.out.println(+sr2+"  found how many terms= "+sadd+"\n" );
	       
	       }
			
		for(i=0;i<si;i++)
		   {
		   if( a[i]==sr3)
		     {
			 tadd=tadd+1;
			 System.out.print("\t"+a[i]);
			 }
			}
			if( tadd==0 )
		   {
		   System.out.println(+sr3+"not found\n");
		   
            }
			else 
	       {
	       System.out.println("\n"+sr3+"  found how many terms= "+tadd+"\n" );
	       }
}
   else
      {
     System.out.println("Array size not cabeble from search three number=");
       }	 
     
  
    } 
  }