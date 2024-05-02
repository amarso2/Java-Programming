import java.io.*;
  class inputdata
    {
	  DataInputStream DIS=new DataInputStream(System.in);
	     int x;
		     void massege()
			  {
			  System.out.println("Enter 1st number=");
			  }
		   void get1() throws IOException
		    {
			  x=Integer.parseInt(DIS.readLine());
			 }
	 }
     
   class even  extends inputdata
      {
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
     class multi extends inputdata
           {
             int y;
               void get2() throws IOException
                {
                 System.out.println("Enter two numbers=");
                 y=Integer.parseInt(DIS.readLine());
                 }
                void claculate()
                  {
                   int i=0,t;
                    for(t=1;t<=y;t++)
                      {
                       i=i+x;
                       }
                    System.out.println("Multiplication values="+i);
                   }					
            }
			
	 class intrest extends inputdata 
	         {
			    float r,t,ci;
				  void get3() throws IOException
				    {
					 System.out.println("Enter rate , time and principle values=");
					 r=Integer.parseInt(DIS.readLine());
					 t=Integer.parseInt(DIS.readLine());
					 }
                    void claculate()
                      {
                   	ci=(float)(x*(Math.pow((1+r/100),t)-1));
                       }
                     void display()
                       {
                        System.out.println("Compound intrest="+ci);
                        }
             }

        class singl_inheri
           {
            public static void main(String ar[]) throws IOException
              {
			   even E=new even();
			    E.massege();
                 E.get1();
                 E.check(); 
               multi m=new multi();
                 m.get2();
				 m.get1();
				 m.claculate();
				 
			   intrest I=new intrest();
                  I.get3();
                  I.get1();
                  I.claculate();
                  I.display();
                }
            }				
               				 