import java.io.*;
 class input_data
  {
    int n; float a;
	 DataInputStream DIS=new DataInputStream(System.in);
	    void get1() throws IOException
		   {
		    
			n=Integer.parseInt(DIS.readLine()); 
			 
			}
   }
   
      class Circle extends input_data
	   {
	   
		 
	     void message()
		 { 
		  System.out.println("Enter a radius for find areas=");
		  }
		   void calculate()
		    {
			 a=(float)(3.14*n*n);
			 }
			 void display()
			  {
			   System.out.println("Area of circle="+a);
			   }
	      }
		  
      class Square extends input_data
	   {
		    
		void message()
		 { 
		  System.out.println("Enter a side of square=");
		  }
		   void calculate()
		    {
			int s=n;
			 a=(float)(s*s);
			 }
			 void display()
			  {
			   System.out.println("Area of square="+a);
			   }
	      }
		  
      class Triangle extends input_data
	   {
	    int h;
		 
	     void message() throws IOException
		 { 
		  System.out.println("Enter a base and height of triangle=");
		  h=Integer.parseInt(DIS.readLine());
		  }
		   void calculate()
		    {
			int b=n;
			 a=(float)(0.5*b*h);
			 }
			 void display()
			  {
			   System.out.println("Area of triangle="+a);
			   }
	      }
			 
			 class Area_hierarchical   
               {
                public static void main(String ar[])throws IOException
                   {
                   Circle C=new Circle();
				    C.message();
					C.get1();
					C.calculate();
					C.display();
					Square S=new Square();
					 S.message();
					 S.get1();
					S.calculate();
					S.display();
					Triangle T=new Triangle();
					 T.message();
					 T.get1();
					T.calculate();
					T.display();
                    }
                 }					