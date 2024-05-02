
import java.util.*;
   class string_substring
 {
 public static void main(String ar[])
    {
	Scanner s=new Scanner(System.in);

System.out.println("Enter a string =");
     String St=s.nextLine();
   System.out.println("Enter position for substring =");
	int pos=s.nextInt();
	String St1=St.substring(pos);
	
 
System.out.println("substring ="+St1);        
 
  }
}