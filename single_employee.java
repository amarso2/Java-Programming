 import java.util.*;
   interface list1
      {
	  void get();
	  }
	  interface list2 extends list1
	  {
	  void cal();
	  void put();
	  }
	  
	  class Employee implements list2
	     {
		 Scanner s=new Scanner(System.in);
		  int ID;
		  String name,addr;
		  float sal,r,t,si;
		  public void get()
		     {
			 System.out.println("Enter Employee details Employee ID ,Name,Address, salery=");
			  ID=s.nextInt();
			  name=s.next();
			  addr=s.next();
			  sal=s.nextFloat();
			  System.out.println("Also salery is principle");
			  System.out.println("Enter rate and time=");
               r=s.nextFloat();
			   t=s.nextFloat();  			   
			  }
			  public void cal()
              {
			   si=sal*r*t/100;
			  }
              public void put()
                {
              System.out.println("Employee ID\t Name\t\t\tAddress\t salery\t intrest");
              System.out.println(ID+"\t\t"+name+"\t\t\t"+addr+"\t"+sal+"\t"+si+"\t");
			    }
			}
                 			  
	  class single_employee
	   {
	   public static void main(String ar[])
	      {
		   Employee E=new Employee();
		       list2 ob=E;
			   ob.get();
			   ob.cal();
			   ob.put();
		   }
		}