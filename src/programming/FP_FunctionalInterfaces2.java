package programming;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP_FunctionalInterfaces2 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

		Function<Integer, Integer> squareFunction = x -> x * x;

		Consumer<Integer> sysoutConsumer = System.out::println;

//		numbers.stream()
//				.filter(isEvenPredicate)
//				.map(squareFunction)
//				.forEach(sysoutConsumer);


		BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
		int sum = numbers.stream().reduce(0, sumBinaryOperator);

		Supplier<Integer> randomIntSupplier = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};

//		System.out.println(randomIntSupplier.get());

		UnaryOperator<Integer> unaryOperator = x -> x *3;
//		System.out.println(unaryOperator.apply(100));


		BiPredicate<Integer, String> biPredicate = (num, str) -> {
			return num < 10 && str.length() > 5;
		};

		System.out.println(biPredicate.test(18, "Prashant"));

		BiFunction<Integer, String, String> biFunction = (num, str) -> {
			return num + " " + str;
		};

		System.out.println(biFunction.apply(18, "Prashant"));

		BiConsumer<Integer, String> biConsumer = (num, str) -> {
			System.out.println(num);
			System.out.println(str);
		};

		biConsumer.accept(18, "Prashant");

	}
}
