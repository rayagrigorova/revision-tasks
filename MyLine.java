package pregovor;

public class MyLine {
	private MyPoint begin;
	private MyPoint end; 
	
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
		this.setEndX(x);
		this.setEndY(y);
	}
	public double getLength() {
		 int xDifSquare = (int) Math.pow((this.begin.getX() - this.end.getX()), 2);
		 int yDifSquare = (int) Math.pow((this.begin.getY() - this.end.getY()), 2);
		 return Math.sqrt(xDifSquare + yDifSquare);
		
 	}
	public double getGradient() {
		int xDiff = this.begin.getX() - this.end.getX();
		int yDiff = this.begin.getY() - this.end.getY();
		return Math.atan2(xDiff, yDiff);
	}
	public String toString() {
		return "MyLine [begin = (" + this.begin.getX() + "," + this.begin.getY() + 
				") , end = (" + this.end.getX() + ", " + this.end.getY() + ")]";
	}
}
