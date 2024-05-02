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
	  
	class Simple implements list2
	  {
	  float p,r,t,si;
	  Scanner S = new Scanner(System.in);
	   public void get()
	    {
		System.out.println("Enter principle ,rate and time=");
		p=S.nextFloat();
		r=S.nextFloat();
		t=S.nextFloat();
		 }
		 public void calcu()
		  {
		  si=(float)(p*r*t/100);
		   }
		   
		  public void disp()
		   {
		   System.out.println("Simple interst="+si);
		   }
	  }
    class Compound implements list3
      {
          float p,r,t;
		  double ci;
	      Scanner S = new Scanner(System.in);
	      public void get()
	       {
	      	System.out.println("Enter principle ,rate and time=");
		    p=S.nextFloat();
		      r=S.nextFloat();
		      t=S.nextFloat();
		     }
		     public void find()
		      {
		     ci= (p*(Math.pow((1+r/100),t)-1));
		      }
		
		  public void disp()
		   {
		   System.out.println("Compound interst="+ci);
		   }
	   }
	   
	   class hierarical_intrest
	     {
		 public static void main(String ar[])
		   {
		   Simple R=new Simple();
		      list2 ob=R;
			  ob.get();
			  ob.calcu();
			  ob.disp();
			  
			  Compound F=new Compound();
			   list3 ob1=F;
			   ob1.get();
			   ob1.find();
			   ob1.disp();
			  }
		 }
 		