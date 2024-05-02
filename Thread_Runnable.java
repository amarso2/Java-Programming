  class Thread1 implements Runnable
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
  class Thread2 implements Runnable
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
   class Thread3 implements Runnable
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
     class Thread_Runnable
      {
       public static void main(String ar[])
         {
		 
       Thread1 T1=new Thread1();
	   Thread2 T2=new Thread2();
	   Thread3 T3=new Thread3();
	   
	   Thread Th1=new Thread(T1);
	   Thread Th2=new Thread(T2);
	   Thread Th3=new Thread(T3);
	   
	   Th1.start();
	   Th2.start();
	   Th3.start();
	   
	   
          }
       }		  