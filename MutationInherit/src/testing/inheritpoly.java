package testing;


public class inheritpoly extends Calculation{
	public static boolean inherit_calc(int a, int b)
	{
	      inheritpoly demo = new inheritpoly();
	      boolean temp=false,temp2=false;
	      temp=demo.div(a, b);
	      if(temp==true)
	      {
	      temp=demo.Pow(a, b);
	      temp2=true;
	      }
	      if(temp2==true && temp==true)
	    	  temp=true;
	      else
	    	  temp=false;
	      return temp;
	}
}
class Calculation {
	   public boolean div(int x, int y) {
	      int z = x / y;
	      if(z>0)
	    	  return true;
	      else
	    	  return false;
	   }
	   public boolean Pow(int x, int y) {
	      int z = x+y;
	      if(z==Math.abs(x)+Math.abs(y))
	    	  return true;
	      else
	    	  return false;
	    	  
	   }
	}

