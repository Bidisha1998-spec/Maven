
public class Cirlce implements Shape {
	
	public double radius;

	public Cirlce(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
System.out.println("drawing circle");
	}

	@Override
	public double getArea() {
		
		// TODO Auto-generated method stub
		return Math.PI*this.radius*this.radius;
	}
	public double getRadius()
	{
		
		return this.radius;
	}

}
