package prac;

public class Circle {
	private final double PI = 3.14;
	
	private int radius;
	private String name;
	
	public Circle() {
		this(1, "random pizza");
	}
	
	public Circle(Circle c) {
		this.radius = c.radius;
		this.name = new String(c.name);
	}
	
	public Circle(int r, String n) {
		this.initialize(r, n);
	}
	
	private void initialize(int r, String n) {
		this.radius = r;
		this.name = n;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public double getPI() {
		return this.PI;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
	
	public String toString() {
		return "name : " + getName() + " radius : " + getRadius();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Class and Object Practice");
		
		/*
		// creating Circle object
		Circle pizza = new Circle();
		
		// initialization using reference variable
		pizza.radius = 10;
		pizza.name = "Cheese Pizza";
		
		// test
		System.out.println(pizza.toString());
		
		
		// code for initialization using method
		Circle pizza2 = new Circle();
		
		pizza2.initialize(8, "Chicago Pizza");
		
		// test
		System.out.println(pizza2.toString());
		*/
		
		// code for initialization using constructor
		Circle pizza = new Circle(15, "Hawaiian Pizza");
		System.out.println(pizza.toString());
		
		Circle pizzaCopy = new Circle(pizza);
		System.out.println(pizzaCopy.toString());
		
	}

}
