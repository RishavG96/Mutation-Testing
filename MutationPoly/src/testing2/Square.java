package testing2;

public class Square extends Shape {
	private final int a, b; // sides

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean area() {
    	//if(a<=0 && b<=0)
    	//	return false;
    	int ar=a*b;
        if(Math.abs(a)==a && Math.abs(b)==b && a==b && ar>0)
        {
        		return true;	
        }
        else
        	return false;
    }
}
