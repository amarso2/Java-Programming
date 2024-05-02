import Room.*;
class pack_Smallest
 {
   public static void main(String ar[])
   {
   Data ob=new Data();
   System.out.println("Enter three number=");
   int x=ob.in();
   int y=ob.in();
   int z=ob.in();
   int sm;
   if(x>y && x>z)
     {
	 sm=x;
	 }
	  else if(y>x && y>z)
	    {
		sm=y;
		}
	    else
		  {
		  sm=z;
		  }
		  System.out.println("Smallest="+sm);
  
   }
 }