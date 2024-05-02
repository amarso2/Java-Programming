
   import java.util.*;
   class Rectangle
      {
        float l,b,ar;
          Rectangle(float ln, float br)
           {
           	l=ln;
            b=br;
            }
       void calculate()
              {
               ar=(float)(l*b);
               }
           void area()
                 {
                 System.out.println("Area of rectangle="+ar);
                 }
        }
     
    	 
     class Triangle
      {
        float b,h,ar;
          Triangle(float bs, float hg)
           {
           	b=bs;
            h=hg;
            }
        void calculate()
              {
               ar=(float)(0.5*h*b);
               }
           void area()
                 {
                 System.out.println("Area of Triangle="+ar);
                 }
       }
	   
	   
	      class Circle
          {
        float r,ar;
          Circle(float rd)
             {
           	r=rd;
			
              }
       void calculate()
              {
               ar=(float)(3.14*r*r);
               }
           void area()
                 {
                 System.out.println("Area of Circle="+ar);
                 }
          }
		  
		     class construc_area
			  {
			  public static void main(String ar[])
			     {
				 int choice;
				     Scanner S=new Scanner(System.in);
				    System.out.println("1.Find area of Rectangle 2. area of Triangle 3. area of Circle");
				    System.out.println("Enter Your choice above option");
					     choice=S.nextInt();
          					
							switch(choice)
							   {
							   case 1: System.out.println("Enter lenght and breadth of rectangle=");
							              float l=S.nextFloat();
							              float b=S.nextFloat();
										   Rectangle R=new Rectangle(l,b);
										    R.calculate();
											R.area();
											break;
											
								case 2:  System.out.println("Enter base and height of Triangle=");
							              float B=S.nextFloat();
							              float H=S.nextFloat();
										   Triangle T=new Triangle(B,H);
										    T.calculate();
											T.area();
											break; 
											
								case 3:  System.out.println("Enter redius of Circle=");
							              float Rd=S.nextFloat();
										   Circle C=new Circle(Rd);
										    C.calculate();
											C.area();
											break; 
													
								default : 	System.out.println("worng choice");
                                   }
                  }
               }				  