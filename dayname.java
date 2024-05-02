class dayname
 {
  public static void main(String ar[])
    {
   int ch=Integer.parseInt(ar[0]);
    switch(ch) 
       {
       case 1: System.out.println("Sunday");
                break;
        case 2: System.out.println("monday");
                break;
       
         case 3: System.out.println("tuesday");
                break;
         case 4: System.out.println("wednesday");
                break;
         case 5: System.out.println("thirsday");
                break;
          case 6: System.out.println("friday");
                break;
          case 7: System.out.println("satarday");
                break;
          
        default: System.out.println("worng choise");
       }
     }
   }