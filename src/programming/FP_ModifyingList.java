package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FP_ModifyingList {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		list.replaceAll(str -> str.toUpperCase());
		System.out.println(list);
//		list.removeIf(str -> str.length() < 6);
//		System.out.println(list);
	}
}
