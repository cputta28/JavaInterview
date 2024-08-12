package in.winny.streams;

import java.util.stream.IntStream;

public class SkipAndLimit {
public static void main(String[] args) {
		
		//in 1-10 numbers  print 2-9 only
		
		IntStream.rangeClosed(4, 15)
		.skip(1)
		.limit(8)
		.forEach(System.out::println);

	}

}
