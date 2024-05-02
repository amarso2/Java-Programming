import Room.Store_Room.*;
   class subpack_smallest
   {
    public static void main(String ar[])
	  {
	  PUBG ob=new PUBG();
	  System.out.println("Enter two number=");
	  
	  int num1=ob.in();
	  int num2=ob.into();
	  int sm;
	  if(num1<num2)
	    {
		sm=num1;
		}
		else
		 {
		 sm=num2;
		 }
		 System.out.println("Smallest="+sm);
		}
	}