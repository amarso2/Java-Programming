 import  java.io.*;
  class Record
   {
    static int roll;
	static String name;
	static float math,che,phy,hindi,eng,per,tot;
	
	static DataInputStream  d= new DataInputStream(System.in);
	    static void get() throws IOException
         {
          System.out.println("Enter Roll nob , name,And also five subject value=");
          roll=Integer.parseInt(d.readLine());
          name=d.readLine();
          math=Float.parseFloat(d.readLine());
           che=Float.parseFloat(d.readLine());
          phy=Float.parseFloat(d.readLine());
           hindi=Float.parseFloat(d.readLine());
           eng=Float.parseFloat(d.readLine());
          }
        static void calculate()
          {
		  tot=(float)(math+che+phy+hindi+eng);
          per=(float)(tot/5);
           }
         static void put()
           {
          System.out.println("Roll no \t Name \t total marks \t percentage");
          System.out.println(roll+"\t\t"+name+"\t"+tot+"\t"+per);
            }
    }
    
     class studentde
        {
      public static void main(String ar[]) throws IOException 
         {
         Record.get();
         Record.calculate();
         Record.put();
         }
        } 		 
				 
	
    