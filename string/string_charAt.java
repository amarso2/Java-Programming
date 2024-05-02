import java.util.*;
   class string_charAt
 {
 public static void main(String ar[]) 
    {
    Scanner DIS= new Scanner(System.in);

System.out.println("Enter a string =");
     String S=DIS.next();
 
System.out.println("Enter index for display charector =");
 int n=DIS.nextInt();
   char k=S.charAt(n);
 
System.out.println("charector ="+k);        
 
  }
}