import java.io.*;
 interface list
  {
   void get()throws IOException;
   void swap();
   void put();
  }
  
  class swaping implements list
    {
	 DataInputStream DIS=new DataInputStream(System.in);
	 
	 int x,y;
	  public void get() throws IOException
	   {
	   System.out.println("Enter two numbers=");
	   x=Integer.parseInt(DIS.readLine());
	   y=Integer.parseInt(DIS.readLine());
	   System.out.println("Before swaping x ="+x+"value of y="+y);
	   }
	   public void swap()
	    {
		int temp=x;
		x=y;
		y=temp;
		}
		public void put()
		 {
		 System.out.println("After swaping x ="+x+"value of y="+y);
		  }
	}
	
	class interface_swap
	  {
	  public static void main(String ar[]) throws IOException
	    {
		swaping s=new swaping();
		 list ob=s;
		 ob.get();
		 ob.swap();
		 ob.put();
		 }
	  }
		