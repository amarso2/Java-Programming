import java.io.*;

import java.util.*;
 interface list
  {
   void get()throws IOException;
   void Check();
   void put();
  }
  
  class prime implements list
    {
	 DataInputStream DIS=new DataInputStream(System.in);
	 
	 int x,i,add=0;
	  public void get() throws IOException
	   {
	   System.out.println("Enter a numbers=");
	   x=Integer.parseInt(DIS.readLine());
	   }
	   public void Check()
	    {
		for(i=2; i<=x/2;i++)
		 {
		  if(x%i==0)
		    {
			add=add+1;
			}
		  }
		  
		}
		public void put()
		 {
		   if(add==0)
		    {
		 System.out.println(x+" is prime");
		     }
			 else
			 {
			 System.out.println(x+" not is prime");
			 }
		 }
	}
	
	class interface_prime
	  {
	  public static void main(String ar[]) throws IOException
	    {
		prime s=new prime();
		 list ob=s;
		 ob.get();
		 ob.Check();
		 ob.put();
		 }
	  }
		