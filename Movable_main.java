package pregovor;

public class Movable_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovablePoint p = new MovablePoint (3, 6, 7, 1);
		System.out.println("Point: " + p.toString());
		p.moveDown();
		p.moveRight();
		System.out.println("Point after: " + p.toString());
		
		MovableCircle c = new MovableCircle(4, 9, 1, 10, 2);
		System.out.println("Circle: " + c.toString());
		c.moveLeft();
		c.moveUp();
		System.out.println("Circle after: " + c.toString());
	}

}
