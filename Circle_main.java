package pregovor;

public class Circle_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(3.64, "Blue");
		Cylinder cyl = new Cylinder(5.64, 4, "Green");
		
		System.out.println("Circle: " + c.getRadius() + " " + c.getColor() + " " + c.getArea());
		System.out.println("Cylinder:" + cyl.getRadius() + " " + cyl.getColor() + " " + cyl.getHeight() +
				" " + cyl.getArea());
	}

}
