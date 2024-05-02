import java.util.*;
import java.lang.*;
 class array_each
   {
   public static void main(String ar[])
      {
	  Scanner Sc=new Scanner(System.in);
	  int at[]=new int[4];
	    System.out.println("Enter 4 number=");
		 for(int i=0; i<4; i++)
		    {
			at[i]=Sc.nextInt();
			}
			System.out.println("four number=");
			for(int temp: at)
			  {
			  System.out.print(temp+"\t");
			  }
		}
	 }