import java.util.*;
  class Input
   {
     int roll,math,phy,che,hindi;
	 String name,addr,sc_name;
	 
	 Scanner S=new Scanner(System.in);
	    void get()
		 {
		 System.out.println("Enter School name ,Roll nob,name and Address of a student=");
		   sc_name=S.next();
		   roll=S.nextInt();
		  name=S.next();
		   addr=S.next();
		   System.out.println("Enter marks of math, physics,chemistry and hindi=");
		    math=S.nextInt();
			phy=S.nextInt();
			che=S.nextInt();
			hindi=S.nextInt();
			}
	 }
	 
	 interface list
	    {
		void calculate();
		}
		
		class Student extends Input implements list
		  {
		   int tot;
		  float per;
		  public void calculate()
		   {
		    tot=math+phy+che+hindi;
			per=(float)(tot/4);
			}
			
			void disp()
			 {
			 get();
			 calculate();
			 System.out.println("School name of student "+sc_name);
			 System.out.println("Roll nob \t Name \t Address\t total \t percentage marks");
			 System.out.println(roll+"\t\t"+name+"\t\T"+addr+"\t"+tot+"\t"+per);
			 }
		  }
		  
		  
		  class Mult_inheri_Record
			 {
			 public static void main(String ar[])
			    {
				Student St=new Student();
				   St.disp();
				   }
				 }
		  
	 