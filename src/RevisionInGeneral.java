import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class RevisionInGeneral {
    public static void main(String[] args) {
        // Declaration of an array
        int[] studentMarks = {10, 20, 40, 5, 60};

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
    }
}
