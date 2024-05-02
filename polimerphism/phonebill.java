import java.util.*;
  class Telcall
    {
	 long ph_no;
	 int n_calls;
	 String name;
	 float amt;
	  Telcall(long p,String St,int n)
	     {
		 ph_no=p;
		 name=St;
		 n_calls=n;

		 }
		 
		 void compute()
		   {
		   if(n_calls>=1 && n_calls<=100)
               {
               	amt=500;
                }
           else if(n_calls>=101 && n_calls<=200)
                {
                 amt= (float)((1.00*n_calls)+500);
                 }
           else if(	n_calls>=201 && n_calls<=300)
                 {
                  amt=(float)((1.20*n_calls)+500);
                  }
              else 
                  {
                   amt=(float)((1.50*n_calls)+500);
                  }				   
	      }
		  
		  void dispdata()
		     {
			 System.out.println("Phone number \t name \t total calls \t Amount");
			 System.out.println(ph_no+"\t"+name+"\t\t"+n_calls+"\t"+amt);
			 }
	}

      class phonebill
         {
        public static void main(String ar[])
            {
           Scanner S=new Scanner(System.in);
            System.out.println("Enter phone number , name ana Number of calls=");
              long 	ph=S.nextLong();
              String name=S.next();
              int   nub=S.nextInt();

           Telcall T=new Telcall(ph,name,nub);
		      T.compute();
			  T.dispdata();
			  }
		   }  
 			  