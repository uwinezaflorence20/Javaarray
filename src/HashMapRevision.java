import java.util.HashMap;
import java.util.Map;

public class HashMapRevision {
    public static void main(String[] args) {
        Map<Integer, String> grades = new HashMap<>();
        grades.put(1, "A");
        grades.put(2, "B");
        grades.put(3, "C");
        grades.put(4, "D");
        grades.put(5, "E");
        grades.put(6, "F");
        grades.put(7, "G");
        grades.put(8, "H");
        grades.put(9, "I");
        grades.put(10, "J");
        for (Integer key1 : grades.keySet()) {
            System.out.println(grades.get(key1));
        }




                String text = "this is a test this is only a test";
                 String[] words = text.split(" ");
                 Map<String, Integer> wordCounts = new HashMap<>();
                 for (String word : words) {
                     wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                     }
                 System.out.println(wordCounts);


    }
}
