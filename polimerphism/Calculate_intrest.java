import java.io.*;
 class Simple {
         float Si,Ci;
      void intrest(float P, float R,int T) {
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
		
		class Calculate_intrest {
		   public static void main(String ar[])throws IOException {
		      DataInputStream DIS=new DataInputStream(System.in);
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
                                     
									  
                       }
              }					   
                             							   
		   