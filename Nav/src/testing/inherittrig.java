package testing;

class triangle {
	public boolean valid(int side1,int side2,int side3)
	{
		boolean t=false;
		if(Math.min(side1, side2)==Math.max(side2, side3))
			t=true;
		return t;
	}
	public boolean triangle_form(int side1,int side2,int side3)
	{
		if (side1==side2 && side2==side3 && side3==side1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class inherittrig extends triangle{
	public static boolean calc(int s1,int s2,int s3)
	{
		inherittrig t=new inherittrig();
		boolean temp=false,temp2=false;
		temp=t.valid(s1, s2, s3);
		if(temp==true){
			temp=t.triangle_form(s1, s2, s3);
			temp2=true;
		}
		if(temp2==true && temp==true)
		{
			temp=true;
		}
		else
		{
			temp=false;
		}
		return temp;
	}
}