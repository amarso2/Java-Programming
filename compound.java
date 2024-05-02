class compound
 {
  public static void main(String ar[])
   {
float p,r,t,ci;
      p=Float.parseFloat(ar[0]);
      r=Float.parseFloat(ar[1]);
      t=Float.parseFloat(ar[2]);
   ci=(float)(p*(Math.pow((1+r/100),t)-1));
    System.out.println("compound intrest="+ci);
    }
}