
 interface list
  {
   void get(float p,float r,float 
   t);
   void calculate();
   void put();
  }
  
  class Simple implements list
    {
	 
	 float pr,rt,tm,si;
	  public void get(float p,float r,float t) 
	   {
	   pr=p;
	   rt=r;
	   tm=t;
	   }
	   public void  calculate()
	    {
		si=(float) (pr*rt*tm/100);
		  
		}
		public void put()
		 {
		 System.out.println("simple intrest="+si);
		
	     }
	}	 
		 
		  class Compound implements list
           {
	 
	        float pr,rt,tm;
			double ci;
	         public void get(float p,float r,float t) 
	         {
	          pr=p;
	           rt=r;
	           tm=t;
	          }
	        public void  calculate()
	         {
		     ci=pr*(Math.pow((1+rt/100),tm)-1);
		  
		      }
		     public void put()
		      {
		    System.out.println("compound  intrest="+ci);
		
	          }
	       }
	class interface_sim_com
	  {
	  public static void main(String ar[]) 
	    {
		float p=Float.parseFloat(ar[0]);
		float r=Float.parseFloat(ar[1]);
		float t=Float.parseFloat(ar[2]);
		
		Simple S=new Simple();
		 list ob=S;
		 ob.get(p,r,t);
		 ob.calculate();
		 ob.put();
		 Compound C=new Compound();
		      ob=C;
		 ob.get(p,r,t);
		 ob.calculate();
		 ob.put();
		 }
	  }
		