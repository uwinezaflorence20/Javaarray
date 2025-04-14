import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
public class Exampleofmap {

    public static void main(String[] args) {
        // declaration
        Map<String,Integer> studentGrades = new HashMap<>();
        Map<Integer,String> EmployeesName = new TreeMap<>();

        //initialization
//        studentGrades = new HashMap<>();
//        EmployeesName = new TreeMap<>();

studentGrades.put("Milla",100);
studentGrades.put("Florence",80);
studentGrades.put("James",90);
studentGrades.put("John",80);

EmployeesName.put(1,"Eric");
EmployeesName.put(2,"Stella");

//accessing the element we use get method
System.out.println(studentGrades.get("Milla"));
System.out.println(studentGrades.get("Florence"));

System.out.println(EmployeesName.get(1));
System.out.println(EmployeesName.get(2));

//updating or modifying  the element we use put
studentGrades.put("florence",120);
System.out.println(studentGrades.get( "florence"));

// getting the size of the mapp

        System.out.println( "the size of the Student Hashmap:"+studentGrades.size());
        System.out.println( "the size of the Employee Treemap:"+EmployeesName.size());

// iteration in map

        for( String name :studentGrades.keySet()){
            System.out.println( name + " : " + studentGrades.get(name));
        }
        for(int employees :EmployeesName.keySet()){
            System.out.println( employees + " : " + EmployeesName.get(employees));
        }

//removing the student from the map we use remove method and contain,isEmpty
studentGrades.remove("james");
       System.out.println(studentGrades.containsKey("Florence"));
       System.out.println(EmployeesName.isEmpty());
       System.out.println(studentGrades.isEmpty());
       //.clear method is used to remove all the key value pairs form the map

       System.out.println(studentGrades);
       System.out.println(EmployeesName);


    }
}
