class Days
 {
  public static void main(String ar[])
    {
    int d=Integer.parseInt(ar[0]);
     
    int y=d/365;
       d=d%365;
     int m=d/30;
      d=d%30;
      int w=d/7;
        d=d%7;
 System.out.println("how many day=" +d+ "year=" +y+ "\n month=" +m+ "\n week="+w);

        }
   }