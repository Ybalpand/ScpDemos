package scp;

import java.util.Arrays;

public class SampleDemo {

	// togglepoint ---> execution point
	// debug as ---> java application
	// method ---> in --> inside check -->F5 go inside method
	// next line -> F6
	// next tooglepoint ---> F8
	// curser ---> variable

	public static void main(String[] args) {
		String words[] = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };

		// output zero one two
		System.out.println(Arrays.toString(words));

		for (int i = 0; i < 5; i++) {
			String temp = words[i];
			words[i] = words[9 - i];
			words[9 - i] = temp;
		}

		System.out.println(Arrays.toString(words));
		
		System.exit(0);

		for (int i = 0; i < 5; i++) {
			for (int j = 9 - i; j > 5; j--) {
				String temp = words[i];
				words[i] = words[j];
				words[j] = temp;

			}

		}
		System.out.println(Arrays.toString(words));
	}

}
