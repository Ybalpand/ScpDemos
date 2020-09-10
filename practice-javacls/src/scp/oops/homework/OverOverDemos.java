package scp.oops.homework;

public class OverOverDemos{
	
	public static void main(String[] args) {
		System.out.println("-------AA--------------------");
		A a=new A();
		a.m1(); //A
		a.m2();
		a.m3();
		a.m4();
		a.m5();
		a.m6();  //A -static
		
		System.out.println("-------BB--------------------");
		B b=new B();
		b.m1();  //B
		b.m2();  //A
		b.m3();  //B
		b.m4();  //B
		b.m5();  //A
		b.m6();  //A - static
		System.out.println("-------CC--------------------");
		C c=new C();
		c.m2();  //C
		c.m3();  //C
		c.m1();  //B
		c.m4();  //B
		c.m5();  //A
		c.m6();  //A -static
		System.out.println("-------DD--------------------");
		D d=new D();
		d.m1();
		d.m2();
		d.m4();
		d.m3(); //C
		d.m5(); //A
		d.m6(); //D  -static
		
		System.out.println("-------EE--------------------");
		E e=new E();
		e.m1();
		e.m2();
		e.m5();
		e.m6(); // E  -static
		
		System.out.println("------AB AC AD AE-------------------");
		
		A ab=new C(); 
		ab.m1();      //B
		ab.m2();      //C
		ab.m3();      //C
		ab.m4();      //B
		ab.m5();      //A
		ab.m6();      //A  -static
		
		System.out.println("------BD()--------------------");
		
		B bd=new D(); 
		bd.m1();   //D
		bd.m2();   //D
		bd.m3();   //C
		bd.m4();   //D
		bd.m5();   //A
		bd.m6();   //D- static
		
		C cd=new D();  
		
		
		
		System.out.println("------BA CA DA EA--------------------");
		//B ab=new A();     //Can not convert from A to B      //BA CA DA EA
		
		//AA BB CC DD EE   AB AC AD AE   BC BD BE   CD CE   BA CA DA EA
		
		
		
		
	}
}

class A {

	public void m1() {
		System.out.println("A- m1");
	}

	public void m2() {
		System.out.println("A- m2");
	}

	public void m3() {
		System.out.println("A- m3");
	}

	public void m4() {
		System.out.println("A- m4");
	}

	public void m5() {
		System.out.println("A- m5");
	}
	
	static void m6() { // default method
		System.out.println("A -m6- static method");
	}
}

class B extends A{
	public void m1() {
		System.out.println("B- m1");
	}

	public void m3() {
		System.out.println("B- m3");
	}

	public void m4() {
		System.out.println("B- m4");
	}
	
	static void m6() { 
		System.out.println("B -m6- static method");
	}

}

class C extends B{
	public void m2() {
		System.out.println("C- m2");
	}

	public void m3() {
		System.out.println("C- m3");
	}

}

class D extends C{
	public void m1() {
		System.out.println("D- m1");
	}

	public void m2() {
		System.out.println("D- m2");
	}

	public void m4() {
		System.out.println("D- m4");
	}
	
	static void m6() { 
		System.out.println("D -m6- static method");
	}

}

class E extends D{
	public void m1() {
		System.out.println("E- m1");
	}

	public void m2() {
		System.out.println("E- m2");
	}

	public void m5() {
		System.out.println("E- m5");
	}
	
	static void m6() { 
		System.out.println("E -m6- static method");
	}

}
