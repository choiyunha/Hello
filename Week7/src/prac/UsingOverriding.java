package prac;

public class UsingOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape start, last, obj;
		
		// using linked list to connect shape objects
		start = new Line();
		last = start;
		
		obj = new Rect();
		last.next = obj;
		last = obj;
		
		obj = new Line();
		last.next = obj;
		last = obj;
		
		obj = new CCircle();
		last.next = obj;
		
		// print elements in linked list
		Shape p = start;
		while (p != null) {
			p.draw();
			p = p.next;
		}
	}
}
