package scp.oops;

public class MethodOverridingDemo {
	public static void main(String[] args) {

		System.out.println("------------------AA-----------------");
		A a = new A();
		a.m1(); // A
		a.m2(); // A  --static
		a.m5(); // A

		System.out.println("------------------AB-----------------");

		A aa = new B();
		aa.m1(); // B
		aa.m2(); // A statc method
		aa.m5(); // B

		System.out.println("----------------BB-------------------");
		B b = new B();
		b.m1(); // B A ---B kade method nasel tr Same static sathi pn
		b.m2(); // B B
		b.m3(); // B B
		b.m5(); // B B

		System.out.println("---------------AD--------------------");

		A a1 = new D();
		a1.m1(); // D
		a1.m2(); // A static method
		a1.m5(); // D

		System.out.println("----------------DD-------------------");

		D d = new D();
		d.m1(); // D
		d.m2(); // D--static 
		d.m3(); // D
		d.m4(); // D
		d.m5(); // D

		System.out.println("--------------BC---------------------");
		B bb = new C();
		bb.m1(); // C
		bb.m2(); // A-static
		bb.m3(); // C

	}

}

class A {
	public void m1() {
		System.out.println("A -- (M1)");
	}

	static void m2() { // default method
		System.out.println("A -- (M2)-- static method");
	}

	public Number m5() {
		System.out.println("A -- (M5)");
		return 0;
	}

}

								//      A
class B extends A { 			// B 		D
	public void m1() { 			// C
		System.out.println("B -- (M1)");
	}

	public static void m2() {
		System.out.println("B -- (M2)--static method");
	}

	public void m3() {
		System.out.println("B -- (M3)");
	}

	public Integer m5() {
		System.out.println("B -- (M5)");
		return 0;
	}

}

class C extends B {
	public void m1() {
		System.out.println("C -- (M1)");
	}

	public static void m2() {
		System.out.println("C -- (M2)-- static method");
	}

	public void m3() {
		System.out.println("C -- (M3)");
	}

}

class D extends A {
	public void m1() {
		System.out.println("D -- (M1)");
	}

	public static void m2() {
		System.out.println("D -- (M2)-- Static method");
	}

	public void m3() {
		System.out.println("D -- (M3)");
	}

	public void m4() {
		System.out.println("D -- (M4)");
	}

	public Double m5() {
		System.out.println("D -- (M5)");
		return 0.0;
	}

}