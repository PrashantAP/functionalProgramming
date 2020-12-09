package programming;

import java.util.List;

public class FP02Exercises {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		// find the sum of square of  all numbers
		int square = numbers.stream().map(x -> x * x).reduce(0, Integer::sum);
		System.out.println(square);

		// find the sum of cube of  all numbers
		int cube = numbers.stream().map(x -> x*x*x).reduce(0, Integer::sum);
		System.out.println(cube);

		// find the sum of odd numbers
		int odd = numbers.stream().filter(x -> x % 2 == 1).reduce(0, Integer::sum);
		System.out.println(odd);

	}

}
