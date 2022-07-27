import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example {

	public static void main(String[] args) {

		Predicate<Integer> p = (t) -> {
			if (t % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		boolean result = p.test(20);
		System.out.println(result);

		Predicate<Integer> p1 = t -> t % 2 == 0;
		boolean result1 = p1.test(20);
		System.out.println(result1);

		Consumer<String> cn = c -> {
			String s = c.concat("Welcome").replace('e', 'q').toUpperCase();
			System.out.println(s);
		};
		cn.accept("Hello");

		Supplier<Integer> sp = () -> {
			Random rn = new Random();
			Integer num = rn.nextInt(5)+1;
			return num;
		};
		Integer result2 = sp.get();
		System.out.println(result2);
	}
}
