  class Thread1 extends Thread
  {
  public void run()
      {
	  for(int i=1; i<5; i++)
	     {
		 System.out.println("From Thread1 : i="+i);
		 }
		 System.out.println("Exit from 1");
	   }
   }
  class Thread2 extends Thread
    {
	 public void run()
	   {
	   for(int j=1; j<5; j++)
	      {
		  System.out.println("From Thread2 : j="+j);
		  }
		System.out.println("Exit from 2");
        }
      }
   class Thread3 extends Thread
      {
      public void run()
        {
       for(int k=1; k<5; k++)
          { 
         System.out.println("From Thread3 : k="+k);
          }
         System.out.println("Exit from 3");
         }
       }
     class Thread_text
      {
       public static void main(String ar[])
         {
        new Thread1().start();
        new Thread2().start();
        new Thread3().start();
          }
       }		  