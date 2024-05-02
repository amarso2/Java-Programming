import java.util.*;
 class input_data
  {
    int n; float a;
	 Scanner S=new Scanner(System.in);
	   
	    void get1()
		   {
		    System.out.println("Enter a number=");
			n=S.nextInt();
			 
			}
   }
   
      class even extends input_data
	   {
	   
		   void check()
		    {
			if(n%2==0)
			 System.out.println("Even="+n);
			 else
			  System.out.println("Odd="+n);
			 }
	      }
		  
      class prime extends input_data
	   {
	          
		   void check()
		    {  
			 int i=2,m=n,p=0;
		      for(i=2 ; i<=n/2 ;i++)
			  {
			     if(n%i==0)
				   {
				    p++;
					break;
					}
				}
				if(m==1)
				  System.out.println("1 is not prime or prime");
				  else
				  { 
				 if(p==0)
				  {
				  System.out.println(m+" is prime");
				  }
				  else 
				  System.out.println(m+" not is prime");
				  }
	
				  
			}
				  
					
	      }
		  
      class polidrome extends input_data
	   {
	    void find()
           {
		    int rev=0,rem,m=n;
             for(;n>0;n=n/10)
               {
                rem=n%10;
                 rev=rev*10+rem;
               }
              if(rev==m)
               System.out.println(m+" is polindrome");	
              else 
               System.out.println(m+"not is polindrome");	
             }			   

	      }
			 
			 class number_hierarchical   
               {
                public static void main(String ar[])
                   {
                    even E=new even();
					 E.get1();
					 E.check();
					 prime P=new prime();
					 P.get1();
					 P.check();
					 polidrome PO=new polidrome();
					 PO.get1();
					 PO.find();
					 
                    }
                 }					