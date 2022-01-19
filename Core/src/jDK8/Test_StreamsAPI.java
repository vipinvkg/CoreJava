package jDK8;

import java.util.Arrays;
import java.util.List;

public class Test_StreamsAPI {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,5,2,69,5,36,12,10,14);
		list.stream().forEach(l -> System.out.println(l));//it will print all elements of list.
		//list.stream().distinct().forEach(l-> System.out.println(l));// it will print all elements but removes duplicate.
		//list.stream().sorted().forEach(l -> System.out.println(l));//it will print all elements & sort by ascending order.
		//list.stream().limit(5).forEach(l -> System.out.println(l));//It limits and returns the stream according to the given maxSize parameter
		//list.stream().skip(7).forEach(l -> System.out.println(l));//It skips the given N elements of the stream 

	}
}
