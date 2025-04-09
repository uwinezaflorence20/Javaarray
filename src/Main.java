import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 GradeManager manager = new GradeManager();
 int[] grades = {88, 74, 92, 67, 85,
                90, 78, 81, 69, 95,
                76, 83, 70, 89, 93,
                65, 80, 77, 68, 87};

 System.out.println("The student grades are: ");
 manager.printGrade(grades);

 System.out.println("\nThe Sorted grade in ascending order are: ");
 manager.sortGrade(grades);

 System.out.println("\nThe Search the student marks : ");
 manager.searchStudentGrade(grades,76);

        System.out.println("\n📍 Grade at index 0: " + manager.getGradeIndex(grades, 0));



























































        int[] studentGrade = {100,59,56,43,67,43,20,56};
        int sum = 0;
        int avg = 0;
        try {
            System.out.println(studentGrade[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println( "ArrayIndexOutOfBoundsException" +e);
        }
        finally {
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
        System.out.println( "The summation of the student marks is:" +sum);
        System.out.println( "The Average of the student marks is:" +avg);
        Arrays.sort(studentGrade);
        System.out.println( "The sorted in Ascending order:" +Arrays.toString(studentGrade));
        Integer[] age = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Arrays.sort(age, (a, b) -> b - a); // or: Comparator.reverseOrder()

        System.out.println("The sorted array in descending order: " + Arrays.toString(age));
    }
}