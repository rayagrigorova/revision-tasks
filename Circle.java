package pregovor;

public class Circle {
	private double radius; 
	private String color;
	
	public Circle () {
		setRadius(1.0);
		setColor("red");
	}
	
	public Circle(double radius) {
		this.setRadius(radius);
		setColor("red");
	}
	
	public Circle(double radius, String color) {
		this.setRadius(radius);
		this.setColor(color); 
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return (Math.PI * Math.pow(this.getRadius(), 2)); 
	}
	
	public String toString() {
		return "Circle[radius = " + this.getRadius() + ", color = " + this.getColor() + "]";
	}
}
