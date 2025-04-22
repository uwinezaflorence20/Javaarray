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


        //example  practive numer 3

        Employee employee = new Employee("John Smith",
                100,2000);
        System.out.println("The name for the employee " +
                "is " +employee.name+ " the employee Id is " +employee.employeeId+ " And the salary is "
                +employee.salary);
        employee.calculatePay();

        FullTimeEmployee full = new FullTimeEmployee("Florence",2,100000,"nothing just salary");
        System.out.println("The name for the employee is " +full.name+ " the employee Id is " +full.employeeId+ " And the salary is " +full.salary+ " And for the addition benefit is "+ full.banefitsPackage);
        System.out.println("The salary of the Part Time Employee is "+full.calculatePay());

        PartTimeEmployee part = new PartTimeEmployee("milli",3,20000,4.5,2);
        System.out.println("The name for the employee is " +part.name+ " the employee Id is " +part.employeeId+ " And the salary is " +part.salary+ "The hour rate is " +part.hourlyRate+ "and The hours she worked is " +part.hoursWorkedPerWeek);
        System.out.println("The salary of the Part Time Employee is "+part.calculatePay());



        //Polymorphism practice 1

        NumberOperation number = new NumberOperation();
        System.out.println("The product of two numbers: "+number.multiply(10,10));
        System.out.println("The product of three numbers: "+number.multiply(10,10,20));
        System.out.println("The product of two Double  numbers: "+number.multiply(10.2,10.4));


        Shapetwo[] shapes = new Shapetwo[3];
        //Polymorphism practice 2
        shapes[0] = new Circletwo("Red", 10);
        shapes[1] = new Rectangletwo("Blue", 5, 7);
        shapes[2] = new triangle("Green", 6, 4);


        for(Shapetwo s : shapes) {
            s.draw();
            System.out.println("Area of the shape is: " + s.getAreatwo());
            System.out.println("----------------------------------------------------------------------");
        }


        //INTERFACES

        // Create a Circle object with radius 3
        Circle2 circle = new Circle2(3);
        circle.draw(); // Drawing a Circle
        System.out.println("Area: " + circle.getArea()); // Circle Area

        System.out.println(); // Just for better separation

        // Create a Rectangle object with width 4 and height 5
        Rectangle2 rectangle2 = new Rectangle2(4, 5);
        rectangle2.draw(); // Drawing a Rectangle
        System.out.println("Area: " + rectangle2.getArea()); // Rectangle Area

        System.out.println(); // Just for better separation

        // Create a Triangle object with base 6 and height 2
        Triangle2 triangle = new Triangle2(6, 2);
        triangle.draw(); // Drawing a Triangle
        System.out.println("Area: " + triangle.getArea()); //

System.out.println("--------------------------------------------------------------------------------");
System.out.println();

        //INTERFACE2

        Bird bird = new Bird();
        bird.fly();

        Airplane airplane = new Airplane();
        airplane.fly();

        Kite kite = new Kite();
        kite.fly();

        //INTERFACE 3

        FileLogger fileLogger = new FileLogger();
        fileLogger.logMessage("This is a log message");

        ConsoleLogger consoleLogger = new ConsoleLogger();
        consoleLogger.logMessage("This is a console message");




        // example of paypal and creditcards

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        CreditCard creditCard = new CreditCard();
        PayPal payPal = new PayPal();
System.out.print("Attempting payment with Credit Card: ");
        paymentProcessor.processPayment(creditCard);
System.out.print("Attempting payment with PayPal: ");
        paymentProcessor.processPayment(payPal);

        paymentProcessor.processPayment("creditcard", 100.0);



        //Interface exercises for the class

        EmailNotification emailNotification = new EmailNotification();
        SMSNotification smsNotification = new SMSNotification();

        emailNotification.sendNotification(" This is a Email ! Your account has been updated.",NotificationPriority.HIGH);
        smsNotification.sendNotification("This is a sms ! Meeting reminder in 30 minutes.",NotificationPriority.MEDIUM);


        }
    }









