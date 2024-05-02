   import java.util.*;
     abstract class swap_base
       {
	      int x,y;
		   Scanner sc=new Scanner(System.in);
         void get_data() {
		     System.out.println("Enter two number=");
			    x=sc.nextInt();
				y=sc.nextInt();
				System.out.println("value of x=" +x+ "and y=" +y);
			}
			
		 abstract void mannege();
		 abstract void display();
		}
		
		 class swap_drive extends swap_base {
		       void mannege() {
			     int temp=x;
				      x=y;
					  y=temp;
					}
				   void display() {
				    System.out.println("values of x=" +x+ "and y=" +y);
					}
			}
  
       class abs_awap  { 
	      public static void main(String Ar[]) {
		   swap_drive ob=new swap_drive();
		     ob.get_data();
			 ob.mannege();
			 ob.display();
			}
		}
              
		
		
		   
            		 