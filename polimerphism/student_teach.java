import java.util.*;
 class record
  {
     void show(String name, int roll, float marks)
	  {
	       float per=(float)marks/3;
		   System.out.println("Details of a student");
		    System.out.println(" Name \t roll \t percentage marks\n");
			System.out.println( name+"\t" +roll+ "\t" +per);
			
	   }
	   void show(int id,String name, float sallery)
	  {
	       
		   System.out.println("Details of a teacher");
		    System.out.println(" ID \t name \t net sallery\n");
			System.out.println( id+"\t" +name+ "\t"+sallery+"\n");
	   }
	}
	
	class student_teach
	 {
	  public static void main(String a[])
	    {
		 Scanner S=new Scanner(System.in);
		   System.out.println("Enter Student detail name, roll nobs and marks of three sub=");
		     String nm=S.next();
			 int rol=S.nextInt();
			 int mth=S.nextInt();
			 int phy=S.nextInt();
			 int che=S.nextInt();
			float marks=(float)(mth+phy+che);
			  System.out.println("Enter teacher detail ID,name and sallery=");
			     int id=S.nextInt();
				 String name=S.next();
				 float sl=S.nextFloat();
				 record R=new record();
				  R.show(nm,rol,marks);
				  R.show(id,name,sl);
		}
	}