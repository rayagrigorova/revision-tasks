package pregovor;

public class MovablePoint implements Movable {
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	public MovablePoint() {
		
	}	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.setX(x);
		this.setY(y);
		this.setxSpeed(xSpeed);
		this.setySpeed(ySpeed);
	}
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + "), speed = (" + this.getxSpeed() + "," + this.getySpeed() + ")";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	public int getySpeed() {
		return ySpeed;
	}
	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	@Override
	public void moveUp() {
		this.setY(this.getY() + this.getySpeed());
	}
	@Override
	public void moveDown() {
		this.setY(this.getY() - this.getySpeed());
	}
	@Override
	public void moveLeft() {
		this.setX(this.getX() - this.getxSpeed());
		
	}
	@Override
	public void moveRight() {
		this.setX(this.getX() + this.getxSpeed());
		
	}
	
	
}
