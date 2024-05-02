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
          second(int a, int b)
		   {  	     super(a);
		 
		          y=b;
		   }
		  void swap()
		   {
		    System.out.println("before sawping Value of x="+x+"\n and value of y="+y);
	         int temp=x;
			      x=y;
				  y=temp;
			System.out.println("After swaping Value of x="+x+"\n and value of y="+y);
			}
		}
  
     class inhrit_cuns
      {
         public static void main(String ar[])throws IOException
            {
             DataInputStream	DIS=new DataInputStream(System.in);
             System.out.println("Enter two number=");
              int b=Integer.parseInt(DIS.readLine());
              int a=Integer.parseInt(DIS.readLine());
               second ob=new second(a,b);
                ob.swap();
             }
        }			 