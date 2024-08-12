package in.winny.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxCharString {
	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("balaiah", "Yatham", "Nagarkurnool");
		//List<String> stringList = Arrays.asList("winny", "vicky", "lucky");

		Optional<String> reduce = stringList.stream().reduce((s1, s2) -> s1.length() < s2.length() ? s1 : s2);

		System.out.println(reduce.get());

	}

}
