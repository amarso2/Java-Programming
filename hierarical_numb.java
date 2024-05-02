   import java.util.*;
   interface list1
    {
	void get();
	void disp();
	}
	interface list2 extends list1
	 {
	 void calcu();
	 }
	 interface list3 extends list1
	   {
	   void find();
	   }
	  
	class Reverse implements list2
	  {
	  int num,rev=0,rem=0;
	  Scanner S = new Scanner(System.in);
	   public void get()
	    {
		System.out.println("Enter a number=");
		num=S.nextInt();
		 }
		 public void calcu()
		  {
		  while(num>0)
		   {
		   rem=num%10;
		   rev=rev*10+rem;
		   num=num/10;
		   }
		   }
		  public void disp()
		   {
		   System.out.println("Reverse of a number="+rev);
		   }
	  }
    class Factorial implements list3
      {
          int num;
		  long fact=1;
          Scanner S=new Scanner(System.in);
          public void get()
             {
           System.out.println("Enter a number=");
             num=S.nextInt();
              }
			  public void find()
			    {
				for(; num>1; num--)
				 {
				 fact=fact*num;
				  }
				 }
				  public void disp()
				   {
				   System.out.println("Factorial of a number="+fact);
				   }
	   }
	   
	   class hierarical_numb
	     {
		 public static void main(String ar[])
		   {
		   Reverse R=new Reverse();
		      list2 ob=R;
			  ob.get();
			  ob.calcu();
			  ob.disp();
			  
			  Factorial F=new Factorial();
			   list3 ob1=F;
			   ob1.get();
			   ob1.find();
			   ob1.disp();
			  }
		 }
 		