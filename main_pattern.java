import java.io.*;
   class pattern
     {
	  int i,j;
	     void show() {
		 for(i=1; i<=2; i++) {
		    for(j=1; j<=10; j++) {
		      System.out.print("*");
			  }
			System.out.println();
			}
		   for(i=1; i<=3; i++) {
		    for(j=1; j<=3; j++) {
		      System.out.print("*");
			  }
			System.out.println();
			}
		 for(i=1; i<=2; i++) {
		    for(j=1; j<=10; j++) {
		      System.out.print("*");
			  }
			System.out.println();
			}
		 for(i=1; i<=6; i++) {
		    for(j=1; j<=3; j++) {
		      System.out.print("*");
			  }
			System.out.println();
			}
		 }
       }
    class main_pattern
       {
        public static void main(String ar[]) {
             pattern p=new pattern();
			   p.show();
			  }
	    }
 			 
		    