package scp.oops;

public class OverridingDemo {

	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.eating();           //parent
		
		Child child=new Child(10);
	//	child.eating();      //child
		System.out.println(child.index);    //1
		
		//Child child2=new Parent();     Can  not convert parent to child
		
	//	Parent parent=new Child();      //runtime object ---> child    overriding method -> works basis on runtime object.
	//	parent.eating();      //child
	}

}

class Parent{
	public void eating() {
		System.out.println("Veg");
	}
	
	public int index=1;
}

class Child extends Parent{
	public void eating() {
		System.out.println("Non-Veg");
	}

	public Child(int index) {
		index=index;
	}
	
	
}
