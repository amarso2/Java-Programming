import Room.*;
class pack_rectangle
 {
   public static void main(String ar[])
   {
   Data ob=new Data();
   System.out.println("Enter length and bridth of rectangle=");
   int l=ob.in();
   int b=ob.in();
   int area,peri;
   if(l>0 && b>0)
     {
	 area=l*b;
	 peri=2*(l+b);
	 System.out.println("Area of rectangle="+area+"\n perimeter="+peri);
	 
	 }
	  
	    else
		  {
		  System.out.println("Enter only positive number");
		  }
  
   }
 }