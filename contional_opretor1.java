import java.util.*;

class contional_opretor1
   {
   public static void main(String args[])
     {
    Scanner S= new Scanner(System.in);
	 System.out.println("Enter two numbers=");
	 int x=S.nextInt();
	 int y=S.nextInt();
	 int gr=(x>y)?x:y;
	 
      System.out.println("greatest="+gr);
   }
  }