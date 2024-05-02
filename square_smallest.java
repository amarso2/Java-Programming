    import java.util.*;
	  class Square
	   {
	    int x;
		 Scanner s=new Scanner(System.in);
		  void get1()
            {
             System.out.println("Enter a number=");
              x=s.nextInt();
             }
           void find()
               {
                float sq= (float) (Math.sqrt(x));
                 System.out.println("Square root="+sq);
                }
        }
      
        class smallest extends Square   
              {
               int y;
                 void get2()
                   {
                    System.out.println("Enter 2nd number=");
                     y=s.nextInt();
                    }
                void find1()
				    {
                     if(x<y)
                        
                         System.out.println("Smallest="+x);	
                         
                        else
                         System.out.println("Smallest="+x);
				    }
				}
     
      class square_smallest
        {
         public static void main(String ar[])
            {
             smallest ob=new smallest();
               ob.get1();
               ob.find();
              
                ob.get1();
				ob.get2();
               ob.find1();               			  
			  }
        }
		