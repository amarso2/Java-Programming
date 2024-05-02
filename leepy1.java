class leepy1
   {
   public static void main(String args[])
     {
    int y=Integer.parseInt(args[0]);
     

    if(y%100==0)
      {
      if(y%400==0)
         {

         
      System.out.println("leep year="+y);
       }
    else
      {
    System.out.println("Not leep year="+y);
     }
    }
   else
     {
   if(y%4==0) 
       {
      System.out.println("leep year="+y);
        }
     else
        {
        System.out.println("not leep year="+y);
           }
        }
  
   }
  }