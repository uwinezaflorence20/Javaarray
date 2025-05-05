import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 8, 20, 3, 15);

        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());

        System.out.println("Numbers greater than 10: " + filteredNumbers);
    }
}
