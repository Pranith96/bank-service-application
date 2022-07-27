import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * List<Integer> list = new ArrayList<>(); list.add(1); list.add(2);
		 */

		List<Integer> list = Arrays.asList(1, 2, 13, 19, 16, 11, 3, 4, 5, 6, 15, 21, 7, 8, 28, 14, 18, 9, 10);
		Stream<Integer> response = list.stream().filter(x -> x % 2 == 0);
		List<Integer> r1 = response.collect(Collectors.toList());
		List<Integer> newList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(newList);

		List<Integer> newList1 = list.stream().map(x -> x * 5).collect(Collectors.toList());
		System.out.println(newList1);

		List<Integer> newList2 = list.stream().filter(x -> x % 2 == 0).map(x -> x * 5).collect(Collectors.toList());
		System.out.println(newList2);

		List<Integer> newList3 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(newList3);

		List<Integer> newList4 = list.stream().sorted((x, y) -> x.compareTo(y)).collect(Collectors.toList());
		System.out.println(newList4);
		
		List<Integer> newList5 = list.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList());
		System.out.println(newList5);
		
		list.stream().sorted((x, y) -> y.compareTo(x)).forEach(z -> System.out.print(z+ " "));
		System.out.println();
		long result = list.stream().filter(x -> x % 2 == 0).count();
		System.out.println(result);
		
		Optional<Integer> maxValue = list.stream().max((x, y) -> x.compareTo(y));
		System.out.println(maxValue.get());
		
		Optional<Integer> minValue = list.stream().min((x, y) -> x.compareTo(y));
		System.out.println(minValue.get());
	}
}
