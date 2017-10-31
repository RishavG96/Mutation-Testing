package testing2;


public abstract class Shape {
    public abstract boolean area();
    public static boolean ispoly(int a, int b)
	{
		boolean temp=false,temp2=false;	
        Shape rectangle = new Rectangle(a, b);
        Shape square = new Square(a,b);
        temp=rectangle.area();
        if(temp==true)
        {
        	temp=square.area();
        	temp2=true;
        }
        if(temp2==true && temp==true)
        	temp=true;
        else
        	temp=false;
        return temp;
        
        
	}
}
