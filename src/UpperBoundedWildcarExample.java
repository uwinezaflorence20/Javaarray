import java.util.List;

public class UpperBoundedWildcarExample {
    public static double printList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(10, 20, 30);
        double sum1 = printList(integerList); // fixed here
        System.out.println("Sum: " + sum1);

        List<Double> doubleList = List.of(1.5,2.5);
        double sum2 = printList(doubleList);
        System.out.println("Sum: " + sum2);
    }
}
