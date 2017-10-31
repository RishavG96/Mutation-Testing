package testing2;

public class Rectangle extends Shape {
    private final int width, length; //sides

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public boolean area() {
        // A = w * l
    	/*if(width<=0 && length<=0)
    		return false;*/
    	boolean p=false;
        int res=width * length;
        if(res==Math.abs(width)*Math.abs(length))
        	p=true;
    	return p;
    }
}