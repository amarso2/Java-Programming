import java.io.*;

import java.util.*;
 interface list
  {
   void get()throws IOException;
   void Condtion();
   void put();
  }
  
  class Greatest implements list
    {
	 DataInputStream DIS=new DataInputStream(System.in);
	 
	 int x,y,z,gr;
	  public void get() throws IOException
	   {
	   System.out.println("Enter three numbers=");
	   x=Integer.parseInt(DIS.readLine());
	   y=Integer.parseInt(DIS.readLine());
	   z=Integer.parseInt(DIS.readLine());
	   }
	   public void Condtion()
	    {
		if(x>y)
		  {
		  if(x>z)
		     {
			 gr=x;
			 }
			 else
			 {
			 gr=z;
			 }
		  }
		  else
		  {
		   if(y>z)
		     {
			 gr=y;
			 }
			 else
			 {
			 gr=z;
			 }
		  }	 
		}
		public void put()
		 {
		 System.out.println("Greatest ="+gr);
		 }
	}
	
	class interface_Greatest
	  {
	  public static void main(String ar[]) throws IOException
	    {
		Greatest s=new Greatest();
		 list ob=s;
		 ob.get();
		 ob.Condtion();
		 ob.put();
		 }
	  }
		