class charector
 {
  public static void main(String ar[]) 
    {
     
  char ch= ar[0].charAt(0);
 if(ch>=65&&ch<=90 ||ch>=97&&ch<=122)
    {
      
    switch(ch) 
       {
      
       case 'A': 
        case 'E': 
       
         case 'I': 
         case 'O': 
         case 'U':
          case 'a': 
          case 'e': 
       
           case 'i': 
           case 'o': 
            case 'u':
                    System.out.println("vowel");
                     break;
          
          
        default: System.out.println("cansonent");
       }
}
   else
 {System.out.print(" not alphabet");
}
     }
   }