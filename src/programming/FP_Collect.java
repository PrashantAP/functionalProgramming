package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP_Collect {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		// square of numbers
		List<Integer> collectedList = numbers.stream().map(num -> num * num).collect(Collectors.toList());
		System.out.println(collectedList);

		// even number filter
		List<Integer> evenNum = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNum);

		// length of all the course titles
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		List<Integer> length = courses.stream().map(str -> str.length()).collect(Collectors.toList());
		System.out.println(length);


	}

}
