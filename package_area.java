import Store.*;
  class package_area
    {
	public static void main(String ar[])
	   {
	   int area;
	   Data ob =new Data();
	    System.out.println("Enter length and breadth=");
		int l=ob.my_Int();
		int b=ob.my_Int();
		  if(l>0 && b>0)
		    {
			 area=l*b;
			System.out.println("Area of rectangle="+area);
			}
			else
			{
			System.out.println("not claculate area");
			}
		}
	 }          