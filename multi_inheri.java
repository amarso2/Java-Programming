import java.io.*;
  class inputdata
    {
	  DataInputStream DIS=new DataInputStream(System.in);
	     int x;
		     void massege()
			  {
			  System.out.println("Enter 1st number=");
			  }
			  void massege2()
			  {
			  System.out.println("Enter two number=");
			  }
		   void get1() throws IOException
		    {
			  x=Integer.parseInt(DIS.readLine());
			 }
	 }
     
   class even  extends inputdata
      {
			     int y;
			
               void get2() throws IOException
                {
                 y=Integer.parseInt(DIS.readLine());
                 }  
	      void check()
		  {
		    if(x%2==0)
			   {
			    System.out.println("Evan"+x);
				}
				else
				 System.out.println("Odd"+x);
		   }
       }
     class multi extends even
           {

                void calculate1()
                  {
                   int i=0,n;
                    for(n=1;n<=y;n++)
                      {
                       i=i+x;
                       }
                    System.out.println("Multiplication values="+i);
                   }					
            }
			
	 class intrest extends multi 
	         {
			    float t,r,ci;
				  void get3() throws IOException
				    {
					 System.out.println("Enter rate , time and principle values=");
					 r=Integer.parseInt(DIS.readLine());
					 }
					 
                    void calculate2()
                      {
                   	ci=(float)(y*(Math.pow((1+r/100),x)-1));
                       }
                     void display()
                       {
                        System.out.println("Compound intrest="+ci);
                        }
             }

        class multi_inheri
           {
            public static void main(String ar[]) throws IOException
              {
			   intrest I=new intrest();
			    I.massege();
                 I.get1();
                 I.check(); 
               
			   I.massege2();
                 I.get2();
				 I.get1();
			     I.calculate1();
				 
                  I.get3();
                  I.get1();
				  I.get2();
                  I.calculate2();
                  I.display();
                }
            }				
               				 