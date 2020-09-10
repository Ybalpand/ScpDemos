package scp.oops;

/**
 * 
 *  
 */
public class OverloadingDemo {

	public static void main(String[] args) {

		/*A a=new A();
		char cha = 96;
		a.m1(null,null);
	//	a.m1(10, 20);
		a.m1(10);*/
		
		System.exit(0);
		XX o=new XX();
		o.m1(10);
		o.m1(10.0);
		o.m1(10.0F);
		byte b=10;
		o.m1(b);      //byte, -> short, int, long , float , double
		
		char ch=69;
		o.m1(ch);        //char -> int, long , float, double
	}
}
/*class A{
	public void m1(Object o , Integer i) {
		System.out.println("m1  ---> (object,integer)");
	}
	public void m1(Number s,Integer n2 ) {
		System.out.println("m1  ---> (Numebre,number)");
	}
	public void m1(Number s) {
		System.out.println("m1  ---> (Numebre)");
	}
	public void m1(Object s) {
		System.out.println("m1  ---> (Obj)");
	}
	}
	*/

class XX{
	

	
	public void m2() {
		System.out.println("m2  ---> ()");
	}
	public void m1() {
		System.out.println("m1  ---> ()");
	}
	public void m1(byte b) {
		System.out.println("m1  ---> (byte)");
	}
	public void m1(short s) {
		System.out.println("m1  ---> (short)");
	}
	public void m1(int i) {
		System.out.println("m1  ---> (int)");
	}
	
	public void m1(long y) {
		System.out.println("m1  ---> (long)");
	}
	public void m1(float y) {
		System.out.println("m1  ---> (float)");
	}
	
	public void m1(double y) {
		System.out.println("m1  ---> (double)");
	}
	public void m1(int x, int y) {
		System.out.println("m1  ---> (int,int)");
	}
	public void m1(String x) {
		System.out.println("m1  ---> String()");
	}
	public void m1(Number x) {
		System.out.println("m1  ---> (number)");
	}
	public void m1(Object x) {
		System.out.println("m1  ---> (Object)");
	}
	
	
}

class Person{
	
	private int perId;
	private String perName;
	private String perAdress;
	
	public void working(int x) {						 
		System.out.println("not working --> noparam");
	}
	
	public void working(double x) {
		System.out.println("not working --> noparam");
	}
	
	public void working(String x) {
		System.out.println("working - string");
	}
	
	public void working(String param, int num) {
		System.out.println("working ---> str,int");
	}
	
	public void working(int num, String param) {
		System.out.println("working ---> int,str");
	}
	
}




