import java.util.Arrays;
import java.util.List;
public class Upper {
    public static void main(String[] args) {
        List <String> words = Arrays.asList("mama","papa","abana");
        System.out.println("Words in lower case:");
        System.out.println(words);
        List<String> upperWords = words.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Words in upper case:");
        System.out.println(upperWords);
    }
}
