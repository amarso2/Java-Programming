import Room.*;
class pack_prime
 {
   public static void main(String ar[])
   {
   Data ob=new Data();
   System.out.println("Enter a number for find evin odd=");
    int num=ob.in();
	   if(num%2==0)
	      {
		  System.out.println("even");
		  }
		  else
		  {
		  System.out.println("odd");
		  }
   System.out.println("Enter a number=");
   int n=ob.in();
  int i=1,add=0;   
   while(i<n/2)
    {
   if(n%i==0)
   {
   add=add+1;
     }
    i++;
    }
  if(add==1)
    {
   System.out.println("prime");
      }
  else
    {
     System.out.println("not prime");
    }
   }
 }