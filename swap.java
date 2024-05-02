class swap
  {
  public static void main(String args[])
 {
    int x=Integer.parseInt(args[0]);
    int y=Integer.parseInt(args[1]);
  System.out.print("Before swaping=\n1st value="+x+"\n 2nd value="+y);
   int temp=x;
          x=y;
          y=temp;
    
System.out.print("After swaping=\n1st value="+x+"\n 2nd value="+y);
 
   }
}