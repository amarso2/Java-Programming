import java.util.*;
  interface list1
   {
   void get();
   void put();
   }
   interface list2 extends list1
     {
      void sub1();
     }
     interface list3 extends list1 
      {
      void sub2();
       }
    class Director implements list2
     {
	  Scanner S=new Scanner(System.in);
	    String DI,name,addr;
		float sal;
      public void get()
         {
        System.out.println("Enter Director indursty name ,name,address ,salery package=");
		DI=S.next();
		name=S.next();
		addr=S.next();
		sal=S.nextFloat();
         }
        public void put()
		  {
		  System.out.println("indursty name \t Name \t Address\t Sallery");
		  System.out.println(DI+"\t\t"+name+"\t"+addr+"\t"+sal);
		  }
		  
		  public void sum1()
		  {
		  get();
		  put();
		  }
		}
		class Manneger implements list3
		      {
			  Scanner S=new Scanner(System.in);
	         String MI,name,addr;
		     float sal;
            public void get()
             {
             System.out.println("Enter manneger indursty name ,name,address ,salery package=");
		      MI=S.next();
		      name=S.next();
		      addr=S.next();
		      sal=S.nextFloat();
              }
              public void put()
		       {
			    System.out.println("Details of manneger");
		       System.out.println("indursty name \t Name \t Address\t Sallery");
		       System.out.println(MI+"\t\t"+name+"\t"+addr+"\t"+sal);
		       }
		  
		       public void sum2()
		        {
		        get();
		        put();
		        }
		}
		
		class hierari_record
		  {
		  public static void main(String ar[])
		     {
			 Director D=new Director();
			 list2 ob=D;
			 ob.sub1();
			 Manneger M=new Manneger();
			 list3 ob1 =M;
			  ob1.sub2();
			  }
		   }