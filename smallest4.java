class smallest4
   {
   public static void main(String args[])
     {
    int p=Integer.parseInt(args[0]);
     int q=Integer.parseInt(args[1]);
     int r=Integer.parseInt(args[2]);
    int s=Integer.parseInt(args[3]);
    int t=Integer.parseInt(args[4]);
   int sm=(p<q && p<r && p<s && p<t)? 0: 1;
    if(sm==0)
      {
      System.out.println("smallest="+p);
       }
 
    sm=(q<p && q<r && q<s && q<t)?0:1;
     if(sm==0)
      {
      System.out.println("smallest="+q);
       }

  
    sm=(r<p && r<q && r<s && r<t)?0:1;
     if(sm==0)
      {
      System.out.println("smallest="+r);
       }
   
   sm=(s<p && s<q && s<r && s<t)?0:1;
     if(sm==0)
      {
      System.out.println("smallest="+s);
       }

   sm=(t<p && t<q && t<r && t<s)?0:1;
     if(sm==0)
      {
      System.out.println("smallest="+t);
       }   
    }
  }