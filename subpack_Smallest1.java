import Room.Store_Room.*;
import java.util.*;
class subpack_Smallest1
 {
   public static void main(String ar[])
   {
   Scanner Sc=new Scanner(System.in);
   
   PUBG ob=new PUBG();
   System.out.println("Enter three number=");
   int x=ob.in();
   int y=ob.into();
   int z=Sc.nextInt();
   
   int sm=0;
   if(x<y && x<z)
     {
	 sm=x;
	 }
	  else if(y<x && y<z)
	    {
		sm=y;
		}
	    else if(z<y && z<x)
		  {
		  sm=z;
		  }
		  
		  else {
		  System.out.println("All number are equals");
		  }
		  System.out.println("Smallest="+sm);
  
   }
 }