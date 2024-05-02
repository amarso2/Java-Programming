import java.util.*;

class outer
 {
   class inner
      {
	  int a,b;
	    Scanner S=new Scanner(System.in);
		 void get1()
		  {
		  System.out.println("Enter two number=");
		  a=S.nextInt();
		  b=S.nextInt();
		  }
		  void small()
		    {
			if(a<b)
			  System.out.println("Smallest="+a);
			  else
			   System.out.println("Smallest="+b);
			}
       }
	   
		Scanner S = new Scanner(System.in);
         int p,q,r;
          void get2()
             {
             System.out.println("Enter 3rd number=");
             r=S.nextInt();
              }
           void greatest()
                {
                 inner in=new inner();
                   in.get1();
                    in.small();
                    in.get1();
                    p=in.a;
                    q=in.b;
                     get2();
                   int g=p;
                      if(q>g)
                         g=q;
						 if(r>g)
						   g=r;
					System.out.println("Smallest="+g);
                  }
    }

         class inner_number
         {
         public static void main(String ar[])
            {
              outer ob=new outer();
                  ob.greatest();
            }
         }			
						
                          						 
  