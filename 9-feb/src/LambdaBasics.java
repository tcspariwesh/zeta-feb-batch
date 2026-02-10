import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaBasics {

	static Predicate<Double> predicate = (x) -> {
		System.out.println("value  =" + x);
		return x % 2 == 0;
	};
	static Consumer<String> consumerLambda = message -> System.out.println(message);

	public static void main(String[] args) {
		Calculator calculator = (x, y) -> x + y;
		System.out.println(calculator.add(2, 3));
//		consumerLambda.accept("Hi");
//		System.out.println(predicate.test(10.3));
	}
}
