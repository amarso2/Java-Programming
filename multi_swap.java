import java.util.*;
  class First
    {
	  Scanner S=new Scanner(System.in);
	  int x,y;
	   void get1()
	    {
		 System.out.println("Enter 1st number=");
		 x=S.nextInt();
		 }
	}
	class Second extends First 
	  {
	    void get2()
		 {
		 System.out.println("And second number=");
		   y=S.nextInt();
		  }
       }
   class Third extends Second
         {
          void swap()
            {
			System.out.println("value of x="+x+ "\t and y="+y);
             int temp=x;
                   x=y;
                   y=temp;
			System.out.println("value of x="+x+ "\t and y="+y);
              }
           }

      class multi_swap
        {
           public static void main(String ar[])
              {
               Third T=new Third();
                T.get1();
                T.get2();
                T.swap();
                }
         }				