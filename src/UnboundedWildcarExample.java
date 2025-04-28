import java.util.List;

public class UnboundedWildcarExample {
  public static void printList(List<?> List) {
      for(Object item:List){
          System.out.println(item);
      }
  }
  public static void main(String[] args) {
      List<Integer> integerList = List.of(1,2,3);
      printList(integerList);

      List<String> stringList = List.of("apple","banana","cherry");
      printList(stringList);

      List<Double> doubleList = List.of(1.1,2.2,3.3);
      System.out.println(doubleList);
  }
}
