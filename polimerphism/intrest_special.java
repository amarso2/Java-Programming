import java.io.*;
   class Input_data {
       Sacnner Sc=new Scanner(System.in);
	      void input() {
	           System.out.println("Enter principle, rate and time to find simple intrest=");
     			   float p=Float.parseFloat(DIS.readLine());
				   float r=Float.parseFloat(DIS.readLine());
				   int  t=Integer.parseInt(DIS.readLine());
				   }
			  }
			  
 class Simple {
         float Si,Ci;
      void intrest(float P, float R,int T) {
	        input();
	     Si= (float)(P*R*T/100);
	
		 }
		      void display() {
		       System.out.println("Simple Intrest="+Si);
		      }
	}
	
	 class Compound extends Simple {
	         
	      void intrest (float p,float r,int t) {
		       Ci= (float) (p*(Math.pow((1+r/100),t)-1));
			   }
			   void display() {
			    System.out.println("Compound intrest="+Ci);
			 	  }
				   void Result(float p,float r,int t) {
					 intrest(p,r,t);
					  display();
					  super.intrest(p,r,t);
					  super.display();
		}
		}
		
		class intrest_special {
		   public static void main(String ar[])throws IOException {
		      DataInputStream DIS=new DataInputStream(System.in);
			   System.out.println("Enter for 1. Calculate simple intrest 2. for compound intrest=");
			          int choice=Integer.parseInt(DIS.readLine());
					      switch(choice) {
						         case 1:  Input_data id=new Input_data();
								            break;
								           
			                    case 2:
								        System.out.println("Enter principle, rate and time to find simple intrest=");
					                     float p=Float.parseFloat(DIS.readLine());
			                             float r=Float.parseFloat(DIS.readLine());
                                         int  t=Integer.parseInt(DIS.readLine());
							  // System.out.println("Enter principle, rate and time to find compound intrest=");
					           //float P=Float.parseFloat(DIS.readLine());
			                    //float R=Float.parseFloat(DIS.readLine());
                               //int T=Integer.parseInt(DIS.readLine());
				               Compound ob=new Compound();
				    
                                     ob.Result(p,r,t);
								      break;
									  default :System.out.println("worng chice=");
                                     
									  
                       }
              }					   
     }                        							   
		   