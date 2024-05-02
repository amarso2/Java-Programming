import Store.store1.*;
  class package_factorial
    {
	public static void main(String ar[])
	   {
	   Data1 ob =new Data1();
	    System.out.println("Enter a integer value=");
		int n=ob.my_Int();
		int fact=1;
		  for(;n>1;n--)
		     {
			 fact*=n;
			 }
			 System.out.println("Factorial="+fact);
			 
		  
		}
	 }