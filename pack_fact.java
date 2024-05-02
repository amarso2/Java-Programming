import Room.*;
class pack_fact
 {
   public static void main(String ar[])
   {
   Data ob=new Data();
   System.out.println("Enter a number=");
   int n=ob.in();
     int fc=1;
	 while(n>1)
	   {
	   fc*=n;
	   n--;
	   }
		  System.out.println("Factorial="+fc);
		
	   
	 
   }
 }