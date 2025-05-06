
import java.util.*;
import java.util.List;
import java.util.stream.*;
public class StreamCalculationExample {
    public static void main(String[] args) {
        //creating the stream
        List<String> names = Arrays.asList("paccy","fique","fillette","zero","phina");

        List<String> combining = names.stream()
                .filter(n-> n.length()>5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("the combining of the names: "+combining);

        names.forEach(name-> System.out.println("Name: "+name));
        Stream<String> stream = names.stream();
        System.out.println("the stream of the names: "+stream);

        // creating the stream and using the fileter

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("the origin  numbers: "+numbers);
//
//        List<Integer> lessthanten = numbers.stream()
//                .filter(n-> n>=10)
//                .count();

        List<Integer> filteredNumber = numbers.stream()
                .filter(m->m%2 == 0)
                .toList();
        System.out.println("the filtered numbers: "+filteredNumber);

        List<Integer> anotherFiltered = numbers.stream()
                .filter(n->n%2!=0)
                .collect(Collectors.toList());
        System.out.println("the another filtered numbers: "+anotherFiltered);

        //map examples it change somethingon the elements
        List<String> words = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("the words in upper case: "+words);
        List<Integer> length = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("The length of the words: " + length);


        //for each examples

        names.stream()
                .forEach(name-> System.out.println("hello my name is "+name+" ! "));

    }
}
