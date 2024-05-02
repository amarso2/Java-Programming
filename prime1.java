class prime1
 {
   public static void main(String ar[])
   {
   int n,i=1,add=0;

    n=Integer.parseInt(ar[0]);
   while(i<n)
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
 }}