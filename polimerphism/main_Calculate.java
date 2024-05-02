import java.util.*;
  class Square {
         float pr;
      void calculate(float a)  {
	      pr=(float)(4*a);
		
		}
		 void display() {
		  System.out.println("perimeter of square="+pr);
		  }
	}
	
	class Circle extends Square {
	  void calculate(float r) {
	      float cir=(float) (2*3.14*r);
		  System.out.println("Circumfrence of circle="+cir);
		  }
		 void Result(float a,float r) {
		    calculate(r);
			 super.calculate(a);
			 super.display();
			}
			
	}
	
	    class main_Calculate {
		  public static void  main(String ar[]) {
		  
		   Scanner S=new Scanner(System.in);
		    System.out.println("Enter Side of a square=");
			  float A=S.nextFloat();
			  System.out.println("Enter rediuse of circle=");
			   float R=S.nextFloat();
			   Circle C=new Circle();
			   C.Result(A,R);
			  }
		}
	 