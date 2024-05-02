import java.awt.*;
import java.applet.*;
  public class parameter_test extends Applet
     {
	   String S;
	     public void init()
		  {
		   S=getParameter("Amar");
		   }
		   public void paint(Graphics g)
		     {
			  g.drawString(S,30,50);
			  }
	 }
	 
	 