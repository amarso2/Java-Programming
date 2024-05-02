 import java.util.*;
   interface list1
      {
	  void get1();
	  }
	  interface list2 extends list1
	  {
	  void get2();
	  }
	  interface list3 
	     {
		 void cal();
		 }
	  interface list4 extends list3,list2
	   {
	  void put();
	   }
	  
	  class Employee implements list4
	     {
		 Scanner s=new Scanner(System.in);
		  int ID;
		  String name,addr;
		  float sal,r,t,si;
		  public void get1()
		     {
			 System.out.println("Enter Employee details Employee ID ,Name,Address, salery=");
			  ID=s.nextInt();
			  name=s.next();
			  addr=s.next();
			  sal=s.nextFloat();
			  }
			 public void get2()
			 {
			  System.out.println("Also salery is principle");
			  System.out.println("Enter rate and time=");
               r=s.nextFloat();
			   t=s.nextFloat();  			   
			  }
			  public void cal()
              {
			   si=(float)sal*r*t/100;
			  }
              public void put()
                {
              System.out.println("Employee ID\t Name\t\t\tAddress\t salery\t intrest");
              System.out.println(ID+"\t\t"+name+"\t\t\t"+addr+"\t"+sal+"\t"+si+"\t");
			    }
			}
                 			  
	  class hybrid_employee
	   {
	   public static void main(String ar[])
	      {
		   Employee E=new Employee();
		       list4 ob=E;
			   ob.get1();
			   ob.get2();
			   ob.cal();
			   ob.put();
		   }
		}