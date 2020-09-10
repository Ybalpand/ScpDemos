package demo;

public class Sub extends Super{
	

	public Sub(String test) {
		super(test);
		System.out.println("SUB class "+test);
		super.i=2;
	}

	/*
	 * public Sub(String test) { i=2; }
	 */
public static void main(String[] args) {
	Sub sub=new Sub("Helo");
	System.out.println("Sub : "+sub.i);
}
}
