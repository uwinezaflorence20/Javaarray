import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        String fileLocation = "C:\\Users\\user\\OneDrive\\Desktop\\WriteNameToFile\\src\\Myname.txt";
        String name = " 1. Uwineza Florence \n Student at university of Rwanda \n Year 3 Computer science";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation))) {
            writer.write(name);
            System.out.println("Name written to file successfully!");
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Error in reading file! " + ex.getMessage());
        }

        int[] studentGrade = {100, 59, 56, 43, 67, 43, 20, 56};
        int sum = 0;
        int avg = 0;
        try {
            System.out.println(studentGrade[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException" + e);
        } finally {
            System.out.println("Finally this indices is not in the array");
        }
        //highest and the lowest
        int Highest = studentGrade[0];
        int Lowest = studentGrade[0];
        for (int i = 1; i < studentGrade.length; i++) {
            if (studentGrade[i] > Highest) Highest = studentGrade[i];
            if (studentGrade[i] < Lowest) Lowest = studentGrade[i];
        }

        System.out.println("Highest: " + Highest);
        System.out.println("Lowest: " + Lowest);


        // displaying the marks of the student
        for (int i = 0; i < studentGrade.length; i++) {
            System.out.println(studentGrade[i]);
            sum += studentGrade[i];
            avg = sum / studentGrade.length;

        }
        System.out.println("The summation of the student marks is:" + sum);
        System.out.println("The Average of the student marks is:" + avg);
        Arrays.sort(studentGrade);
        System.out.println("The sorted in Ascending order:" + Arrays.toString(studentGrade));
        Integer[] age = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Arrays.sort(age, (a, b) -> b - a); // or: Comparator.reverseOrder()

        System.out.println("The sorted array in descending order: " + Arrays.toString(age));


        //answer to question1
        Grade marks = new Grade();
        Integer[] grade1 = {10, 20, 30, 40, 50};
        int[] grades = {10, 20, 30, 40, 50};

        marks.PrintGrade(grades);
        // will return index 1
        marks.SearchNumber(grades, 30);
        marks.Sort(grades);
        marks.SortAscending(grade1);

        Map<String, Integer> elements = new HashMap<>();

        elements.put("A", 1);

        elements.put("B", 2);

        System.out.println(elements.get("A"));

        int[] array1 = {5,10,15};

        System.out.println(array1[1]);




        SavingsAccount mySavings = new SavingsAccount(1000, 0.05);
// Calls both constructors
        mySavings.deposit(500);
// Inherited from BankAccount
        mySavings.applyInterest();
// Specific to SavingsAccount
        System.out.println("Current balance: " + mySavings.getBalance());


        //Practice examples one

        Shape shape = new Shape("Blue");
        shape.draw();
        System.out.println("the area of the shape is: " + shape.getArea());

        Circle cr = new Circle("Red",20);
        cr.draw();
        System.out.println("the area of the circle is: " + cr.getArea());

        Rectangle rectangle = new Rectangle("pink",4,5);
        rectangle.draw();
        System.out.println("the area of the rectangle is: " + rectangle.getArea());



        // practice number 2

        Vehicle vehicle = new Vehicle("Black",40);
        System.out.println("the vehicle color  is " +vehicle.color+ " And the speed is "+ vehicle.speed);
        vehicle.start();

        Motorcycle motorcycle = new Motorcycle("white",50,true);
        System.out.println("the vehicle color  is " +motorcycle.color+ " And the speed is "+ motorcycle.speed + " And has side car is "+ motorcycle.hasSidecar);
        motorcycle.start();

        Truck truck = new Truck("red",100,1000);
        System.out.println("the vehicle color  is " +truck.color+ " And the speed is "+ truck.speed + " And has side car is "+ truck.cargoCapacity);
        truck.start();






    }

    }
