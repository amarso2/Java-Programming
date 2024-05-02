import Room.*;
import java.util.*;
class pack_compound
 {
   public static void main(String ar[])
   {
   Scanner s=new Scanner(System.in);
   
   Data ob=new Data();
   System.out.println("Enter principle ,rate and time=");
   int p=ob.in();
   float r=s.nextFloat();
   float t=s.nextFloat();
   double ci=p*(Math.pow((1+r/100),t)-1);
    System.out.println("Compound intrest="+ci);
   
    
  
   }
 }