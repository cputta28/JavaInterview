package in.winny.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DistinctOperations {

	public static void main(String[] args) {
      System.out.println("*********************");
      
      List<Integer> list=Arrays.asList(1,2,1,3,2,4,5,6);
      //find out put below
      //Distinct operator will used to allow only unique elements, it will not allow duplicate elements
      list.stream().distinct().map(e->e*3).forEach(System.out::println);// expected out put -> 3,6,9,12,15,18
      System.out.println("********************************* ");
      list.stream().distinct().map(e->e).forEach(System.out::println);// expected out put -> 3,6,9,12,15,18

      System.out.println("********************************* ");
      //to get max element using compareTo 
       Optional<Integer> max = list.stream().max(Integer::compareTo);
       System.out.println("max "+max.get());
      
	}

}
