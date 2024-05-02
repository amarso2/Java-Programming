import java.util.*;
   class circle
  {
     float r,ar,cir;
	 final float pi=(float)3.14159265;
  Scanner s =new Scanner(System.in);
     void get()
     	{ 
		System.out.println("Enter Redius of circle=");
          r=s.nextFloat();
		}
		void cal()
		  {
		  ar=(float)(pi*r*r);
		  cir=2*(float)(pi*r);
		  }
		void put()
		{
        System.out.println("Arae of circle="+ar+"\n circumfrance="+cir);
         }
   
    }
   
   
   class area_circle
     {
 public static void main(String ar[])
    {
    circle ob=new circle();
     ob.get();
     ob.cal();
      ob.put();    	 
 
  }
}