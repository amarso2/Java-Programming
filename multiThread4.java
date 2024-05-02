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
	   
     class multiThread4
      {
       public static void main(String ar[])
       {
        Thread1 T1=new Thread1();
        Thread2 T2 = new Thread2();
        Thread3 T3 =new Thread3();
	   
	     T1.setPriority(Thread.MIN_PRIORITY);
		 T3.setPriority(Thread.MAX_PRIORITY);
		 T2.setPriority(Thread.NORM_PRIORITY);
		 
		 T3.start();
		 T2.start();
		 T1.start();
		 
		 }
		}
        