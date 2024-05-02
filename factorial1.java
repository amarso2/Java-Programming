class factorial1
 {
   public static void main(String ar[])
   {
   int n;
long fact=1;
    n=Integer.parseInt(ar[0]);
   while(n>0)
    {
   fact =fact*n;
   n=n-1;
    }
   System.out.println("factorial="+fact);
 }}