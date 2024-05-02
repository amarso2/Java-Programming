import Room.Store_Room.*;
   class subpack_rectangle
   {
    public static void main(String ar[])
	  {
	  PUBG ob=new PUBG();
	  System.out.println("Enter length and breadth of rectangle=");
	  
	  int l=ob.in();
	  int b=ob.into();
	 
	  if(l>0 && b>0)
	    {
		int a=l*b;
		int p=2*(l+b);
		 System.out.println("Area of rectangle="+a+"\n perimeter="+p);
		}
		else
		 {
		 System.out.println("not found");
		}
	   }
	}