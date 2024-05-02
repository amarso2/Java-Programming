import java.io.*;

import java.util.*;
 interface list
  {
   void get()throws IOException;
 
   void put();
  }
  
  class student implements list
    {
	 DataInputStream DIS=new DataInputStream(System.in);
	 
	 int rno;
	 float marks;
	 String name,address;
	 
	  public void get() throws IOException
	   {
	   System.out.println("Enter a student roll number ,name, Address  and marks=");
       rno=Integer.parseInt(DIS.readLine());
       name=DIS.readLine();
       address=DIS.readLine();
       marks=Float.parseFloat(DIS.readLine()); 	   
	   }

		public void put()
		 {
		 System.out.println(" roll number \t name \t Address\t   marks ");
		 System.out.println(rno+"\t"+name+"\t"+address+"\t"+marks);
		 }
	}
	
    class Teacher implements list
    {
	 DataInputStream DIS=new DataInputStream(System.in);
	 
	 int id;
	 float sl;
	 String name,address;
	 
	  public void get() throws IOException
	   {
	   System.out.println("Enter a teacher id ,name, Address  and salery=");
       id=Integer.parseInt(DIS.readLine());
       name=DIS.readLine();
       address=DIS.readLine();
       sl=Float.parseFloat(DIS.readLine()); 	   
	   }

		public void put()
		 {
		 System.out.println(" teacher ID \t name \t Address\t   salery ");
		 System.out.println(id+"\t"+name+"\t"+address+"\t"+sl);
		 }
	}
	
	class interface_record
	
	  {
	  public static void main(String ar[]) throws IOException
	    {
		student s=new student();
		 list ob=s;
		 ob.get();
		 ob.put();
		 
		 Teacher T=new Teacher();
		 ob=T;
		 ob.get();
		 ob.put();
		 }
	  }
		