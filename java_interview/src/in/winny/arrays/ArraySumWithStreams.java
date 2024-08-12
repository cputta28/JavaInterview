package in.winny.arrays;

import java.util.Arrays;

public class ArraySumWithStreams {
	public static void main(String[] args) {
		// Example array
		int[] array = { 1, 2, 3, 4, 5 };

		// Using streams to find the sum
		int sum = Arrays.stream(array).sum();

		System.out.println("Sum of array elements: " + sum);
	}

}
