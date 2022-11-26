package fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;

		while (!quit) {
			try {
				System.out.println("Please input number (0 to quit): ");
				int n = scanner.nextInt();

				if (n != 0) {
					System.out.println("Output is " + solution.fizzBuzz(n));
				} else {
					quit = true;
					scanner.close();
					System.exit(0);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public List<String> fizzBuzz(int n) {
		ArrayList<String> output = new ArrayList<String>();
		for (int i = 1; i < n + 1; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				output.add(i - 1, "FizzBuzz");
			} else if (i % 3 == 0) {
				output.add(i - 1, "Fizz");
			} else if (i % 5 == 0) {
				output.add(i - 1, "Buzz");
			} else {
				output.add(i - 1, Integer.toString(i));
			}
		}

		return output;

	}

}
