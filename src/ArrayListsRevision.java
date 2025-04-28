import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListsRevision {
    public static void main(String[] args) {
        //declaration of arraylists
        List<Integer> numbers= new ArrayList<>();
        ArrayList<Integer> numbers1 = new ArrayList<>();


        // adding elements
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        System.out.println(numbers);

        System.out.println(numbers.get(5));
        numbers.set(0,40);
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }



        //
        System.out.println(numbers.getLast());
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        numbers.set(0,40);
        System.out.println(numbers);
        System.out.println(numbers.size());
        for( Integer number:numbers){
            System.out.println(number);
        }
}
}
