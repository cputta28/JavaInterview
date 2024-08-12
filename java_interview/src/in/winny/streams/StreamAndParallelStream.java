package in.winny.streams;

import java.util.Arrays;
import java.util.List;

public class StreamAndParallelStream {

	public static void main(String[] args) throws InterruptedException {

		// Create a list of numbers
		List<Integer> numbers = Arrays.asList(1, 2, 3);

		// Sequential stream example
		long currentTimeMillisStarts = System.currentTimeMillis();
		long sumOfSquaresSequential = numbers.stream().mapToLong(num -> num).sum();

		System.out.println("Sum of squares using sequential stream: " + sumOfSquaresSequential);
		long currentTimeMillisEnds = System.currentTimeMillis();
		System.out.println("stream time difference: " + (currentTimeMillisEnds - currentTimeMillisStarts));

		// Parallel stream example

		long currentTimeMillisStarts2 = System.currentTimeMillis();
		long sumOfSquaresParallel = numbers.parallelStream().mapToLong(num -> num).sum();

		System.out.println("Sum of squares using parallel stream: " + sumOfSquaresParallel);
		long currentTimeMillisEnds2 = System.currentTimeMillis();
		System.out.println("parallelStream Time  difference: " + (currentTimeMillisEnds2 - currentTimeMillisStarts2));

	}
}
