  class  Table 
    {
     synchronized void print(int n)
         {
         for(int i=1; i<=10; i++)
           {
            System.out.println(n*i);
           }
           try
              {
              Thread. sleep(5000);
               }
             catch(Exception e)			   
			   {               }
			   
	      }
	}	
	
	   class Thread1 extends Thread
	     {
		   Table t;
		   Thread1(Table T)
		     {
			 t=T;
			 }
			 public void run()
			   {
			   t.print(5);
			   }
		  }
		  
		  class Thread2 extends Thread
		    {
			Table t;
			   Thread2 (Table T)
			      {
				  t=T;
				  }
				  public void run()
				     {
					 t.print(7);
					 }
			}
			
			class Thread_table
			  {
			  public static void main(String ar[])
			     {
				 Table ob=new Table();
				 Thread1 T1=new Thread1(ob);
				 Thread2 T2=new Thread2(ob);
				 T1.start();
				 T2.start();
				 }
			   }