package prac;

class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}

class NewStudent extends Person {
	public void set() {
		age = 23;
		name = "최윤하";
		height = 167;
		setWeight(100);
	}
}

public class InheritanceEx {
	public static void main(String[] args) {
		NewStudent s = new NewStudent();
		s.set();
	}
}
