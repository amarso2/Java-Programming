   class Thread1 extends Thread
     {
	 int x;
	 public void run()
	  {
	  for( x=1; x<=10; x++)
	     {
		 if(x==7)
		   {
		   yield();
		   }
		   System.out.println("Thread1 x="+x);
		  }
	   }
	  }
	  
	  
	  
	     class Thread2 extends Thread
       {
	     int y;
	     public void run()
	     {
	      for( y=1; y<=10; y++)
	       {
		  if(y==5)
		    {
		     stop();
		    }
		   System.out.println("Thread2 y="+y);
		  }
	     }
	  }
	  
	     class Thread3 extends Thread
         {
	       int z;
	      public void run()
	       {
	        for( z=1; z<=10; z++)
	         {
		     if(z==0)
		      {
		       try{sleep(5000); }
			    catch( Exception e)
			
				{                }
				
		      }
		     System.out.println("Thread1 3="+z);
		     }
	       }
	   }
	   
	   
	   
	   class multiThread2
	      {
		  public static void main(String ar[])
		     {
			 Thread1 T1=new Thread1();
			 Thread2 T2=new Thread2();
			 Thread3 T3=new Thread3();
			 T1.start();
			 T2.start();
			 T3.start();
			 }
		   }