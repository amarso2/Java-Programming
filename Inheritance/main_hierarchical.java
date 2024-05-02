import java.util.*;
 class input_data
  {
    int x,y,z,R;
	 Scanner s=new Scanner(System.in);
	    void get1()
		   {
		    System.out.println("Enter two number=");
			 x=s.nextInt();
			 y=s.nextInt();
			}
			void get2()
			 {
			  System.out.println("Enter trird number=");
			  z=s.nextInt();
			  }
   }
   
      class Addition extends input_data
	   {
	     void Add()
		   {
		    R=x+y;
			System.out.println("Addition="+R);
			}
		}
		
		class multiplication extends input_data
		 {
		  void multi()
		    {
			  R=x*y*z;
			  System.out.println("Value of multiplication="+R);
			 }
		  }
		  
		  class subtraction extends input_data
		    {
			   void sub()
			     {
				  R=x-y;
				  System.out.println("Subtraction="+R);
				  }
		     }
			 
			 class main_hierarchical   
               {
                public static void main(String ar[])
                   {
                    Addition A=new Addition();
                      A.get1();
                      A.Add();
                    multiplication M=new multiplication();
                       M.get1();
                       M.get2();
                       M.multi();
                    subtraction S=new subtraction();
                       S.get1();
                       S.sub();
                    }
                 }					