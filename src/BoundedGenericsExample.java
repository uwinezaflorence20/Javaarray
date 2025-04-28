import java.util.List;
public class BoundedGenericsExample {
    public static <N extends Number> double sumOfList(List<N> numberList) {
       double sum = 0;
       for (N number : numberList) {
           sum += number.doubleValue();
       }
       return sum;
    }
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3);
        double integerSum = sumOfList(integerList);

        List<Double> doubleList = List.of(1.1, 2.2, 3.3);
        double doubleSum = sumOfList(doubleList);

        List<Float> floatList = List.of(1.1f, 2.2f, 3.3f);

        System.out.println("Sum of integerList: " + integerSum);
        System.out.println("Sum of doubleList: " + doubleSum);
        System.out.println("Sum of floatList: " + sumOfList(floatList));
    }
}
