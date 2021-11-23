import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("10", "68", "75", "7", "21", "12");

		Collections.sort(numbers, (a, b) -> (b + a).compareTo(a + b));

		System.out.print("Output: ");
		numbers.stream().forEach(System.out::print);
	}
}