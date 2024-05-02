class circle
 {
  public static void main(String ar[])
    {
    float r,a,cir;
    r=Float.parseFloat(ar[0]);
   
    a=(float)3.14*r*r;
    cir=2*(float)3.14*r;
  
   System.out.println("Area of circle ="+a+"\nperimeter of circle"+cir);
     }
   }