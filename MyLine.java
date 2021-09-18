package pregovor;

public class MyLine {
	private MyPoint begin;
	private MyPoint end; 
	
	public MyLine() {
		
	}
	public MyLine(int x1, int y1, int x2, int y2){
		begin = new MyPoint(x1, y1);
		end = new MyPoint(x2, y2);
	}
	public MyLine(MyPoint begin, MyPoint end){
		this.begin = begin; 
		this.end = end;
	}
	public MyPoint getBegin() {
		return begin;
	}
	public void setBegin(MyPoint begin) {
		this.begin = begin;
	}
	public MyPoint getEnd() {
		return end;
	}
	public void setEnd(MyPoint end) {
		this.end = end;
	}
	
	public int getBeginX() {
		return this.begin.getX();
	}
	public void setBeginX(int x) {
		this.begin.setX(x);
	}
	public int getBeginY() {
		return this.begin.getY();
	}
	public void setBeginY(int y) {
		this.begin.setY(y);
	}
	
	public int getEndX() {
		return this.end.getX();
	}
	public void setEndX(int x) {
		this.end.setX(x);
	}
	public int getEndY() {
		return this.end.getY();
	}
	public void setEndY(int y) {
		this.end.setY(y);
	}
	
	public int[] getBeginXY() {
		int[] xy = new int[2];
		xy[0] = this.getBeginX();
		xy[1] = this.getBeginY();
		return xy; 
	}
	
	public void setBeginXY(int x, int y) {
		if(this.begin == null ) {
			System.out.println("Uninitialized reference");
			return;
		}
		this.setBeginX(x);
		this.setBeginY(y);
	}
	
	public int[] getEndXY() {
		int[] xy = new int[2];
		xy[0] = this.getEndX();
		xy[1] = this.getEndY();
		return xy; 
	}
	
	public void setEndXY(int x, int y) {
		if(this.end == null ) {
			System.out.println("Uninitialized reference");
			return;
		}
		this.setEndX(x);
		this.setEndY(y);
	}
	public double getLength() {
		 return Math.sqrt(Math.pow((this.getBeginX() - this.getEndX()), 2) + Math.pow((this.getBeginY() - this.getEndY()), 2));
		
 	}
	public double getGradient() {
		return Math.atan2(Math.abs(this.getBeginY() - this.getEndY()), Math.abs(this.getBeginX() - this.getEndX()));
	}
	public String toString() {
		return "MyLine [begin = (" + this.getBeginX() + "," + this.getBeginY() + 
				") , end = (" + this.getEndX() + ", " + this.getEndY() + ")]";
	}
}
