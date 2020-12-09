package programming;

import java.util.List;

public class FP_MethodReferences {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

		courses.stream()
				.map(String::toUpperCase)
				.forEach(System.out::println);
	}
}
