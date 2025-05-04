import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class SwappElements<T> {
 public void swap(List<T> list, int index1, int index2) {
     Collections.swap(list, index1, index2);
 }
// public void findmaximum(List<T extends Number> list){
//     Collections.max()
// }

public static void main(String[] args) {
     SwappElements<String> swappElements = new SwappElements<>();
     List<String> names = Arrays.asList("Alice","Bob","charlie");
     System.out.println("Before the swapp : "+names);

     swappElements.swap(names, 0, 2);
     System.out.println("After the swapp : "+names);
}
}

