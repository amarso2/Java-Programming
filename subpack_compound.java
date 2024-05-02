import Room.Store_Room.*;
import java.util.*;
class subpack_compound
 {
   public static void main(String ar[])
   {
   Scanner s=new Scanner(System.in);
   
   PUBG ob=new PUBG();
   System.out.println("Enter principle , time and rate=");
   int p=ob.in();
   float r=s.nextFloat();
   int t=ob.into();
   double ci=p*(Math.pow((1+r/100),t)-1);
    System.out.println("Compound intrest="+ci);
   
    
  
   }
 }