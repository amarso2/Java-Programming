class smallest3
   {
   public static void main(String args[])
     {
    int x=Integer.parseInt(args[0]);
     int y=Integer.parseInt(args[1]);
   int s=(x<y)?0:1;
    if(s==0)
      {
      System.out.println("smallest="+x);
       }
    else
      {
    System.out.println("smallest="+y);
     }
   }
  }