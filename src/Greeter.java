import java.util.List;

public class Greeter {
    public void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        List<String> names = List.of("Anne","channel","gaju","florence","milli","sandrine");
        names.forEach(greeter::greet);

        //Syntax: objectReference::InstanceMethodName
        names.forEach(person -> greeter.greet(person));
    }
}
