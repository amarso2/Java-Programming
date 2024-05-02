import java.util.*;
   class record
  {
     int rno;
	 short t_sub;
     String name;
     float marks,per;
  Scanner s =new Scanner(System.in);
     void get()
     	{ 
		System.out.println("Enter roll nob ,name and ,number of subject, marks=");
		 rno=s.nextInt();
		 name=s.next();
		 t_sub=s.nextShort();
          marks=s.nextFloat();
		}
		void cal()
		  {
		  per=(float)(marks/t_sub);
		  }
		  
		void put()
		{
        System.out.println("roll nob \t name \t marks \t precentage marks\n");
       	System.out.println(rno+"\t" +name+"\t"+marks+"\t"+per+"\n");	
         }
   
    }
   
   
   class student1
     {
 public static void main(String ar[])
    {
    record r1=new record();
    record r2= new record();
    r1.get();
	r1.cal();
    r1.put();
    r2.get();
	r2.cal();
    r2.put(); 
 
  }
}