import java.io.*;
 class number
  { 
    int r;
	 void game_of_number(int s)
	   {
	    int r=s*s;
		System.out.println("Square of a number="+r);
		}
		void game_of_number(float sq)
	   {
	    float r=(float)(Math.sqrt(sq));
		System.out.println("Square root of a number="+r);
		}
		void game_of_number(long c)
	   {
	    long r=c*c*c;
		System.out.println("Square of a number="+r);
		}
	}
	
	class number_set
	 {
	   public static void main(String ar[]) throws IOException
	    {
		 DataInputStream DIS= new DataInputStream(System.in);
		  System.out.println("Enter a number for find square=");
		   int s=Integer.parseInt(DIS.readLine());
		  System.out.println("Enter a number for find square root=");
		   float sq=Float.parseFloat(DIS.readLine());
		   System.out.println("Enter a number for find cube=");
		   long c=Long.parseLong(DIS.readLine());
             number ob=new number();
		   ob.game_of_number(s);
		   ob.game_of_number(sq);
		   ob.game_of_number(c);
		   
		  }
	}
		    