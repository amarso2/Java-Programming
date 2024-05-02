   class prime2
    {
   public static void main(String args[])
   {
   int add,n;
       
   for(int i=2;i<100;i++)
    { add=0;
	 for(n=2;n<i;n++)
	   {
   if(i%n==0)
     {
       add=1;
      }
     }
  if(add==0)
     {
   System.out.println("prime"+i);
      }
   }
 }}