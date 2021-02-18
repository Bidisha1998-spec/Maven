
public class Rectangle implements Shape {
	public double width;
	public double height;
	
	

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing rectangle");

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}

}
