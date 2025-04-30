import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;


public class lambard {
    public static void main(String[] args) {
//        List<String> doubleNumbers = Arrays.asList(1,2,3,4,5,6,7);

        List<String> names = Arrays.asList("Anne","channel","gaju","florence","milli","sandrine");
        List<String> arrangedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("arranged name of the students in ascending order:"+arrangedNames);


        List<String> arrangedNamesuppercase = names.stream()
                .sorted()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("arranged name of the students in ascending order:"+arrangedNamesuppercase);

        List<String> arrangedNamescharacter = names.stream()
                .sorted()
                .map(name -> name.toUpperCase())
                .filter(name->name.length() ==4)
                .collect(Collectors.toList());
        System.out.println("arranged name of the students in ascending order:"+arrangedNamescharacter);


    }
}
