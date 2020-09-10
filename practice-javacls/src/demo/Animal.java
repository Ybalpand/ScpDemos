package demo;

/*super can be used to refer immediate parent class instance variable.
super can be used to invoke immediate parent class method.
super() can be used to invoke immediate parent class constructor.*/

public class Animal {
	String color = "white";

	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	String color = "black";

	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
	}

	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();
		bark();
	}
}
class TestSuper1 {
	public static void main(String args[]) {
		Dog d = new Dog();
	//	d.printColor();
		d.work(); 
	}
}