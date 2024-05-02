import java.util.*;

class contional_opretor2
   {
   public static void main(String args[])
     {
    Scanner S= new Scanner(System.in);
	 System.out.println("Enter five  numbers=");
	 int a=S.nextInt();
	 int b=S.nextInt();
	 int c=S.nextInt();
	 int d=S.nextInt();
	 int e=S.nextInt();
	 int gr=(a>b && a>c && a>d && a>e)?a:(b>c && b>d&& b>e)?b:(c>d && c>e)? c: (d>e)?d:e;
	 
      System.out.println("greatest="+gr);
   }
  }