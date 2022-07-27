
public class MainMethod {

	public static void main(String[] args) {

		AdditionImpl ad = new AdditionImpl(); // compile time
		ad.add(10, 10);

		Addition ad1 = new AdditionImpl(); // Runtime polymorphism
		ad1.add(10, 10);

		Addition ad2 = (x, y) -> {
			int z = x + y;
			System.out.println(z);
		};
		ad2.add(10, 20);

		Addition ad3 = (x, y) -> System.out.println(x + y);
		ad3.add(20, 20);

		Summation sm = (data) -> {
			String result = data.toUpperCase();
			return result;
		};
		String response = sm.getMessage("Hello welcome");
		System.out.println(response);
		
		Summation sm1 = data -> data.toUpperCase();
		String response1 = sm1.getMessage("Hello welcome");
		System.out.println(response1);
	}
}
