import java.util.*;
  class check
    {
	 int x;
	 Scanner sc=new Scanner(System.in);
	  void input() {
	   System.out.println("Enter a number=");
	     x=sc.nextInt();
		}
		
		void dis() {
		 System.out.println("value 1st="+x);
		 }
	}
   
  class check2 extends check {
       void input() {
        System.out.println("Enter 2nd number=");
          x=sc.nextInt();
        }
        void dis() {
         System.out.println("value 2nd="+x);
         }		 
		 void result() {
		    input();
             dis();
            super.input();
            super.dis();
            }			
	}
	
	 class mainCheck {
	  public static void main(String ar[]) {
	   check2 c=new check2();
	    c.result();
		
	}
  }