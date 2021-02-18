
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Cirlce(10);
		Cirlce n= new Cirlce(10);
		shape.draw();
		System.out.println( n.getRadius());
		System.out.println("area="+shape.getArea());
		
		shape= new Rectangle(10,10);
		shape.draw();
		System.out.println("area="+shape.getArea());
		

	}

}
