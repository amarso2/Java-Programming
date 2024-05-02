import java.io.*;

 class first
  {
  int x;
   first(int a)
   {
   x=a;
   }
  }
  class second extends first
     {
	  int y;
	  second(int a,int b)
	  {
	  super(a);
	  y=b;
	  }
	  void swap()
	    {
	  int z=x;
	      x=y;
          y=z;
		System.out.println("After swaping x =" +x+ "\ty=" +y);
		 }
	   }
	
  class swaping
    {
	public static void main(String ar[]) throws IOException
	   {
	   DataInputStream DIS= new DataInputStream(System.in);
	   System.out.println("Enter two number=");
	   int a=Integer.parseInt(DIS.readLine());
	   int b=Integer.parseInt(DIS.readLine());
	   second ob= new second(a,b);
	   ob.swap();
	   }
	 }