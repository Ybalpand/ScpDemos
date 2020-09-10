package demo;

public class Super{
/*	
	//private synchronized int e; //Illegal modifier for the field e; 
								//only public, protected, private, static, final, transient & volatile are permitted
	transient int b=3;
	protected int a;
	volatile int d;
	
	*/
	
	public int i=0;
	
	public Super(String test) {
		System.out.println("susper class "+test);
		i=1;
		
	}
	
	/*
	 * public static void main(String[] args) { char a[]= new char[10]; for (int i =
	 * 0; i <10 ; ++i) { a[i] = '1'; System.out.println(a[i]+ "" ); //output 1 1 1 1
	 * 1 i++;
	 * 
	 * } }
	 */
}
