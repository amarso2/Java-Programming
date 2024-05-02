 class Thread3 extends Thread
         {
	       int z;
	      public void run()
	       {
	        for( z=1; z<=10; z++)
	         {
		   
		       try{sleep(5000); }
			    catch( Exception e)
				{                }
				
		     System.out.println("Thread1 z="+z);
		     }
	       }
	   }
	   
	   class multiThread3
	     {
		 public static void main(String ar[])
		    {
			Thread3 T=new Thread3();
			T.start();
			}
		  }