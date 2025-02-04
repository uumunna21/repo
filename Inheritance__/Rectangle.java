package Inheritance__;

public class Rectangle extends Shape //extends keywords because it is a subclass
{
	
	private int w;
	private int d;
	
	public Rectangle (String name, String color,int ns, int w, int d)
	{
		super(name,color,ns);
		this.w=w;
		this.d=d;
	}


	@Override
	public String toString()     //********remember the signature
	{
		return super.toString()+ " "+w+" "+d;
	}


	@Override
	public double calcArea() {
		
		return this.d*this.w;
	}
	
	public int getw()
	{
		return this.w;
	}


	@Override
	public void MoveUp(int units) {
		System.out.println("Rectangle moved up "+ units);
		
	}


	@Override
	public void MoveDown(int units) {
		System.out.println("Rectangle moved down "+ units);
		
	}
	
}