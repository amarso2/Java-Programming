import java.util.*;
   class string_dictionary
   
 {
 String St[]=new String[4];
 public static void main(String ar[])
    {
	Scanner s=new Scanner(System.in);
int i,j,k;
 int sz[]=new int[4];
System.out.println("Enter 4 string =");
   for( i=0;i<4;i++)
       {
      St[i]=s.nextLine();
	   }
	     for(i=0;i<4;i++)
         {		 
	       sz[i]=St[i].length;
		    String temp=null;
		   for(j=0;j<sz[i];j++)
		      {
			   for(k=j+1;k<sz[i];k++)
			    {
				  if(St[k].compareTo(St[j]) < 0)
				   {
				 temp=St[j];
				   St[j]=St[k];
				   St[k]=temp;
				  }
				}
			  }
		   }
		
		for(i=0;i<sz;i++)
		   {
		   System.out.println(St[i]+"\t");
		   }
	}
  }
				
				
				
				
