
class charecter
 {
  public static void main(String ar[]) 
    {
     
  char ch= ar[0].charAt(0);
 if(ch>=65&&ch<=90 ||ch>=97&&ch<=122)
        {
 ch=toUpperCase(ch);
    switch(ch ) 
         {
       
       case 'A': 
        case 'E': 
       
         case 'I': 
         case 'O': 
         case 'U':
                    System.out.println("vowel");
                     break;
          
          
        default: System.out.println("cansonent");
         }
        }
          else
           {
		   System.out.print(" not alphabet");
           }
     }
   }