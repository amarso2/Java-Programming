   import java.util.*;
     abstract class circle_base
       {
	      float r;
		   Scanner sc=new Scanner(System.in);
         void get_data() {
		     System.out.println("Enter redius of a circle=");
			    r=sc.nextFloat();
				
			}
			
		 abstract void mannege();
		 abstract void display();
		}
		
		 class circle_drive extends circle_base {
		        float ar;
				  void mannege() {
				     ar=(float)(3.14*r*r);
					}
				   void display() {
				    System.out.println("Area of circle=" +ar);
					}
			}
  
       class abs_circle  { 
	      public static void main(String Ar[]) {
		   circle_drive ob=new circle_drive();
		     ob.get_data();
			 ob.mannege();
			 ob.display();
			}
		}
              
		
		
		   
            		 