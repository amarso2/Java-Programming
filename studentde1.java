 import  java.io.*;
  class Record
   {
     int roll;
	 string name;
	    float math,che,phy,hindi,eng,per,tot;
	
	 DataInputStream DIS= new DataInputStream(System.in);
	     void get() throw IOException
         {
          System.out.println("Enter Roll nob , name,And also five subject value=");
          roll=Integer.parseInt(DIS.readline());
          name=DIS.readline();
          math=Float.parseFloat(DIS.readline());
           che=Float.parseFloat(DIS.readline());
          phy=Float.parseFloat(DIS.readline());
           hindi=Float.parseFloat(DIS.readline());
           eng=Float.parseFloat(DIS.readline());
          }
         void calculate()
          {
		  tot=(float)(math+che+phy+hindi+eng);
          per=(float)(tot/5);
           }
          void put()
           {
          System.out.println("Roll no \t Name \t total marks \t percentage");
          System.out.println(roll+"\t\t"+name+"\t"+tot+"\t"+per);
            }
    }
    
     class studentde1
        {
      public static void main(String ar[]) throw IOException 
         {
		  Record r=new Record();
         r.get();
         r.calculate();
         r.put();
         }
        } 		 
				 
	
    