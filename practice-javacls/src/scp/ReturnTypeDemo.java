package scp;

public class ReturnTypeDemo {

	public static void main(String[] args) {

		mx();
	}

	private static int mx() {
	//	Integer b=10;
		int num=10;
		if(num==20)
			return 0;
		else if (num==30) 
			return 10;
		return 10;
	//	System.out.println();     unrechable code
		
	}

}
