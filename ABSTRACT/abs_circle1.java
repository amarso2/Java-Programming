    import java.util.*;
     abstract class circle_base
       {
	      		
		          
		 abstract void display();
		 abstract void error();
		}
		
		 class circle_drive extends circle_base {
		        float ar;
				
				  void mannege(float r) {
				     ar=(float)(3.14*r*r);
					}
				   void display() {
				    System.out.println("Area of circle=" +ar);
					}
					void error(){
					System.out.println("Error 2.457");
					}
			}
  
       class abs_circle1  { 
	      public static void main(String Ar[]) {
		  float r;
		   Scanner sc=new Scanner(System.in);
		     System.out.println("Enter redius of a circle=");
			    r=sc.nextFloat();
		   circle_drive ob=new circle_drive();
		        if(r>0) {
			 ob.mannege(r);
			 ob.display();
			   }
			   else {
			   ob.error();
			   }
			}
		}
              
		
		
		   
            		 