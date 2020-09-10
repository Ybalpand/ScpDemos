package scp;

import java.util.Arrays;

public class StringDemo {
	
	int i;
	int j;
        void StringDemo() {
            i = 1;
            j = 2;
        }

	private int jj = 10;
	
	public static void main(String[] args) {
		StringDemo demo=new StringDemo();
		System.out.println(demo.toString());
		System.out.println((new StringDemo()).jj);
		
		System.exit(0);
		String Java = "Are you a Java expert? Yes, you are.";
		System.out.println(Java.length());
		System.out.println(" Blank space  :  "+Java.charAt(9));
		System.out.println(Java.contains("?"));
		
		String str11 = "How are you?";
		String str21 = str11.substring(5, 7);
		System.out.println(str21);
		
		StringBuilder sb = new StringBuilder("top 30 Java String interview questions.");
		System.out.println(sb.capacity());
		
		System.out.println(Integer.parseInt("10"));
		
		String x = "techbeamers";
		String y = new String(new char[] { 't', 'e', 'c', 'h', 'b', 'e', 'a', 'm', 'e', 'r', 's' });
 
		System.out.println(x == y);             //false
		System.out.println(x.equals(y));        //true
		
		String word1 = "abcde";
		for (int i = 0; i<4; i+=2) {
		   System.out.println("word : "+ word1);
		}
		char chars[] = {'a', 'b', 'c'};
        String strr = new String(chars);
        System.out.println(strr);
		
		String StrArr[]={"JAVA","JDK","JRE"};
		String Str="JAVA";
		System.out.println(StrArr[0]==Str);
		
		System.exit(0);
		
		//String to byte array convert
		String str = "YOGITA";
		byte[] byteArr = str.getBytes();
		System.out.println("String to byte array: " + Arrays.toString(byteArr)); 		// print the byte[] elements StringToByteArray 

		//byte array to string convert
		byte[] byteArray = {89, 79, 71, 73, 84, 65};
		String strs = new String(byteArray);
		System.out.println(" Byte Array To String : "+strs);

		System.exit(0);
		final String str1 = "social";
		final String str2 = "media";
		String str3 = str1 + str2; // socialmedia
		String str4 = "socialmedia";
		System.out.println(str3 == str4); // Output true

		String s = "Was it a bee or a bat I saw?".substring(9, 12); // bee
		System.out.println(s);

		System.exit(0);

		// how many object create
		String w1 = "AAA"; // scp : 1
		String w2 = new String("AAA"); // heap: 1 scp: already present
		// total --> 2
		System.out.println(w1 == w2); // false
		System.out.println(w1.equals(w2)); // true

		w2 = w2.intern(); // release heap ref point to scp
		System.out.println(w1 == w2); // true
		System.out.println(w1.equals(w2)); // true

		// no of object --> 1-->heap: no ref ---> release --> scp: 1 ref 2 ..>w1/w2

		System.exit(0);

		String r1 = new String("A");
		String r2 = new String("A");
		String r3 = new String("A");
		String r4 = new String("A");

		String t1 = "A";

		// memory --> heap scp--->diff
		System.out.println(r1 == t1); // false 1X : 4X
		System.out.println(r1.equals(t1));// true A A

		t1 = t1.concat("xx"); // Axx
		System.out.println(r1.equals(t1));// false A: Axx

	}

}
