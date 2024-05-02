   // complit area of triangle using herien formula  
   import java.util.*;
   
     abstract class Triangle
       {	
		 abstract void get_data();
		 abstract void calculate();
		 abstract void display();
		}
		
		 class Triangle_drive extends Triangle{
		        int a,b,c;
				double ar;
				 Scanner Sc=new Scanner(System.in);
				    
				  void get_data() {
				    System.out.println("Enter three side of a triangle=");
				      a=Sc.nextInt();
					  b=Sc.nextInt();
					  c=Sc.nextInt();
						   
					}
	
					void calculate() {
					     if(a>0 && b>0 && c>0)
						  {
					   float s=(float) ((a+b+c)/2);
					     ar=(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
						}
						  else {
						     get_data();
							 }
						   }
						  
				   void display() {
				    System.out.println("Area of circle=" +ar);
					}
			}
  
       class abs_Triangle1  { 
	      public static void main(String Ar[]) {
		   Triangle_drive ob=new Triangle_drive();
		     ob.get_data();
			 ob.calculate();
			 ob.display();
			}
		}
              
		
		
		   
            		 