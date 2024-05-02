class smallest2
   {
   public static void main(String args[])
     {
    int x=Integer.parseInt(args[0]);
     int y=Integer.parseInt(args[1]);
      int z=Integer.parseInt(args[2]);
    if(x<y&&x<z)
      {
      System.out.println("smallest="+x);
       }
    if(y<x&&y<z)
      {
    System.out.println("smallest="+y);
     }
     if(z<x&&z<y)
       {
      System.out.println("smallest="+z);
       }
   }
  }