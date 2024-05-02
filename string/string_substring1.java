import java.util.*;
   class string_substring1
 {
 public static void main(String ar[])
    {
	Scanner s=new Scanner(System.in);

System.out.println("Enter a string =");
     String St=s.nextLine();
   System.out.println("Enter staet and last position for substring =");
	int spos=s.nextInt(); 
	int lpos=s.nextInt();
	String St1=St.substring(spos,lpos);
	
 
System.out.println("substring ="+St1);        
 
  }
}