package point;

class MyPoint {
	int x, y;
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// print out the coordination of the Point
	public void showPoint() {
		System.out.println("(" + this.x + "," + this.y + ")");
	}
}
