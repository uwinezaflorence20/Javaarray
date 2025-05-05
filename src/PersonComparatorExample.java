import java.util.Comparator;

public class PersonComparatorExample {
    public static void main(String[] args) {
        Comparator<Person> nameComparator = (p1, p2) -> p1.getName().compareTo(p2.getName());

        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");

        int result = nameComparator.compare(person1, person2);
        System.out.println("Comparison result: " + result);  // Will be negative since "Alice" < "Bob"
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
