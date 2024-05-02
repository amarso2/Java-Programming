import java.util.*;
import java.io.*;
class sbi
  {
   Scanner S=new Scanner(System.in);
  String f_name,L_name,type;
  long Ac;
  float bl,dip,with,wd;

   long input()
    {
   System.out.println( " Accound holder deyails");
    System.out.println("First name,Last name, Account Number,main balance and type of Account=");
	 f_name=S.next();
	L_name=S.next();
	Ac=S.nextLong();
	bl=S.nextFloat();
	type=S.next();
    return (Ac);
    }
    void diposite()
     {
     System.out.println("Enter diposite amount=");
     dip=S.nextFloat();
     bl=(float)bl+dip;
     dip_display();
     }
     void dip_display()
      {
	  
      System.out.println("Account nob=\t"+Ac);
     System.out.println("\t Name=\t\t"+f_name+"\t"+L_name);
	 
      System.out.println("\tDiposite balance=\t"+dip);
     System.out.println("\t blance= \t"+bl);
       }

       void withdrawal()
	 {
	 System.out.println("Enter withdrawal balance=");
	 with=S.nextFloat();
	  wd=(float)(bl-with);
	 if(wd>1000)
	  {
	  bl=bl-with;
	  with_display();
	  }
	  else
	   {
	   System.out.println("sufficient balance not availeble Error");
	   }
	  }
	  void with_display()
	   {
	  System.out.println("Account nob=\t"+Ac);
     System.out.println("\t Name=\t\t"+f_name+"\t"+L_name);
      System.out.println("\tWithdrawal balance =\t"+with);
     System.out.println("\t main balance= \t"+bl);
	    }

	void display()
	 {
	   System.out.println("Account nob=\t"+Ac);
     System.out.println("\t Name=\t\t"+f_name+"\t"+L_name);
      System.out.println("\tTotal balance=\t"+dip);
     System.out.println("\t blance= \t"+bl);
	 }

    }

	 class BANK
	 {
	   public static void main(String ar[])
	     {
	 int choice,i;
	 Scanner Sc=new Scanner(System.in);

	 long Ac[]=new long[2];
	 long S_Ac[]=new long[2];
	   long sr;
	 sbi sb=new sbi;

	   for(i=0;i<2;i++)
	     {
	     System.out.print("Enter  "+(i+1)+"\t");
	     S_Ac[i]= sb.input();

	     }


	     System.out.println("Enter custumer Account nob to Find =");
	     sr=Sc.nextLong();

	     for(i=0;i<2;i++)
	      {
	      if(sr==S_Ac[i])
		{

		System.out.println("Enter types of mode blew=") ;

	      System.out.println("1. Diposite 2. Withdrawal 3. Display main balance");
	      System.out.println("Choose Above option=");
	      choice=Sc.nextInt();
	      switch(choice)
	       {
	       case 1: sb.diposite();
	       break;
	       case 2:sb.withdrawal();
	       break;
	       case 3 : sb.display();
	       break;
	       default :System.out.println("your coice is worng=");

		   }
	    }
		 else
		  {
		  System.out.println("The Account does not found Re-enter");

		  }
		   }
	  }
    }