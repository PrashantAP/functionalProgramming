package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
//		printAllNumbersInListFunctional(numbers);
//		printEventNumbers(numbers);
		printSquaresOfEventNumbers(numbers);

	}


	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().forEach(System.out::println); // Method reference
	}

	private static void printEventNumbers(List<Integer> numbers) {
		numbers.stream()
				.filter(i -> i % 2 == 0)
				.forEach(System.out::println);
	}

	private static void printSquaresOfEventNumbers(List<Integer> numbers) {
		numbers.stream()
				.filter(num -> num % 2 == 0)
				.map(num -> num * num)
				.forEach(System.out::println);
	}

}
