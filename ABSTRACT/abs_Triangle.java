   // complit area of triangle using herien formula  
   import java.io.*;
   
     abstract class Triangle
       {	
		 abstract void get_data();
		 abstract void calculate();
		 abstract void display();
		}
		
		 class Triangle_drive extends Triangle {
		        int a,b,c;
				double ar;
				DataInputStream DIS=new DataInputStream(System.in);
				  void get_data() throws IOException {
				     System.out.println("Enter three side=");
					   a=Integer.parseInt(DIS.readLine());
                       b=Integer.parseInt(DIS.readLine());
                       c=Integer.parseInt(DIS.readLine());					   
					}
	
					void calculate() {
					   float s=(float) ((a+b+c)/2);
					     ar= (Math.sqrt(s*(s-a)*(s-b)*(s-c)));
						}
				   void display() {
				    System.out.println("Area of circle=" +ar);
					}
			}
  
       class abs_Triangle  { 
	      public static void main(String Ar[]) throws IOException {
		   Triangle_drive ob=new Triangle_drive();
		     ob.get_data();
			 ob.calculate();
			 ob.display();
			}
		}
              
		
		
		   
            		 