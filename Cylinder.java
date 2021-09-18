package pregovor;

public class Cylinder extends Circle {
	private double height;
	
	public Cylinder(){
		this.setHeight(1.0);
	}
	public Cylinder(double radius) {
		super(radius);
	}
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height; 
	}
	public Cylinder(double radius, double height, String color) {
		this(radius, height);
		this.setColor(color);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	} 
	
	public double getVolume() {
		return Math.PI * Math.pow(this.getRadius(), 2) * this.getHeight();
	}
}
