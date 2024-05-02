import Room.*;
class pack_polindrom
 {
   public static void main(String ar[])
   {
   Data ob=new Data();
   System.out.println("Enter a number=");
   int n=ob.in();
     int m=n,rev=0,r;
	 while(n>0)
	   {
	   r=n%10;
	   rev=rev*10+r;
	   n=n/10;
	   }
	    if(m==rev)
		  {
		  System.out.println("polindrom");
		  }
		  else
		  {
		  System.out.println("not polindrom");
		  }
	   
	 
   }
 }