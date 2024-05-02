 import java.util.*;
 class Time
  {
    int hr,min,sec;
      Time()
       {
        hr=0;
        min=0;
        sec=0;
        }
       
        void process(int m,int s)
          {
		   min=m;
		   sec=s;
		   
		  int h1=min/60;
			min=min%60; 
			 int r1=min;
			 
			min=sec/60; 
               int r2=min;
		
			int h2=(r1+r2)/60;
			 hr=h1+h2;
			   min=(r1+r2)%60;
			  sec=sec%60; 
			}
			void display()
			  {
			  System.out.println(hr+":"+min+":"+sec+"\t");
			  }
    }
	
	
	class Timeconsume
	 {
	 public static void main(String ar[])
	    {
		 Scanner S=new Scanner(System.in);
		 System.out.println("Enter minutes and seconds=");
		 int m=S.nextInt();
		 int se=S.nextInt();
		Time T=new Time();
		  
			T.process(m,se);
			T.display();
		}	
	 }	  
    