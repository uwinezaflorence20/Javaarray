import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class RevisionInGeneral {
    public static void main(String[] args) {
        // Declaration of an array
        int[] studentMarks = {10, 20, 40, 5, 60};
studentMarks[3] =50;
int saerch = Arrays.binarySearch(studentMarks, 20);
System.out.println(saerch);
        // Convert int[] to List<Integer>
        List<Integer> marks = new ArrayList<>();
        for (int mark : studentMarks) {
            marks.add(mark);
        }

        // Print all student marks
        for (int student : studentMarks) {
            System.out.println(student);
        }

        // Print length of the array
        int LengthOfTheArray = studentMarks.length;
        System.out.println("Length of the array: " + LengthOfTheArray);

        // Find max and min using Collections
        int MaxMarks = Collections.max(marks);
        int MinMarks = Collections.min(marks);
        Collections.sort(marks);
        System.out.println("Sorted array: \n" +Arrays.toString(marks.toArray()) );
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println("ascending marks: " + Arrays.toString(marks.toArray()));

        System.out.println("Max Marks: " + MaxMarks);
        System.out.println("Min Marks: " + MinMarks);

        // Multidimensial array

        int[][] numbers ={
                {1, 2, 3},
                 {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
                sum += numbers[i][j];
            }
            System.out.println("the summation of row is: " + sum);
        }
        System.out.println("the summation is: " + sum);
        numbers[0][1]=10;
        int LengthOfTheArray2 = numbers.length;
        System.out.println("\nLength of the array2: " + LengthOfTheArray2);


        //3D
        int[][][] threeD = {
                {{1, 2}, {3, 4}},
                {{5, 6}, {7, 8}}
        };
        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length; k++) {
                    System.out.print(threeD[i][j][k] + " ");
                }
            }
        }
    }
}
