 import java.util.*;
 class Serial
   {
   Scanner S=new Scanner(System.in);
    private int S_code,No_of_epi;
	private String Title;
	private float Dureation;
	
 public	Serial()
	  {
	   Dureation=30;
	   No_of_epi=10;
	   }
	   
	 public void New_Serial()
          {
           System.out.println("Enter Serial cade And Serial name =");
          	S_code=S.nextInt();
            Title =S.next();
          }
        public void Otherentries(int s,float d)
            {
            Dureation=d;
            No_of_epi=s;
             }
       public void Dispdata()
               {
            System.out.println("Serial code \t Serial Name \t Dureation \t Nob of Episodes ");
            System.out.println(S_code+" \t\t"+Title+"\t"+ Dureation+"\t" +No_of_epi);
               }
    }   
          class Serial_name
            {
             public static void main(String ar[])
                {
				 Scanner S=new Scanner(System.in);
				 Serial ob=new Serial();
				 ob.New_Serial();
				 
				 int code,choice;
				  float Dura;
				  
				  System.out.println("Enter Choice 1. for User define Duration and Nob of episodes 2. for predefine");
				  choice=S.nextInt();
				   if(choice==1)
				     {
				  System.out.println("Enter Number of episodes and Duration=");
				  code =S.nextInt();
				  Dura=S.nextFloat();
				    ob.Otherentries(code,Dura);
					ob.Dispdata();
					  }
					  
					  else if(choice==2)
					    {
						ob.Dispdata();
						}
				     else
        System.out.println("Re enter choice");					 
				}		
            }  
			  
                    			  
	 
	
  