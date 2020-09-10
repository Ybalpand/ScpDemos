package demo;

import java.io.FileNotFoundException;

public class JavaTechnology {

	public static void main(String[] args) throws Exception  {
		A a =new B();
		a.printName(); //Name B
	}

}
class A{
	
	public void printName() throws FileNotFoundException {
		System.out.println("Value-A");
	}
}
class B extends A{
	
	public void printName() throws NullPointerException {
		System.out.println("Name-B");
	}

}
