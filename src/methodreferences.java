import java.util.List;

public class methodreferences {
    public static void main(String[] args) {
        //1. reference to a static method

        List<String> list = List.of("apple","banana","cherry");
        list.forEach(name->{
            System.out.println(name);
        });

        //another way
        list.forEach(System.out::println);
        //syntax ; classname:staticmethodname

        //print is a static method
        //System.out is a class
        System.out.println("hello world");

    }
}
