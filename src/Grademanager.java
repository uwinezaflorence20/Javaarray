import java.util.Arrays;

class GradeManager {

    // Method to print grades
    public void printGrade(int[] grades) {
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println(); // For a clean newline after printing
    }

    // Method to sort and display grades
    public void sortGrade(int[] grades) {
        Arrays.sort(grades);
        System.out.println("The sorted grades are: " + Arrays.toString(grades));
    }

    // Method to search for a grade
    public int searchStudentGrade(int[] grades, int enteredGrade) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == enteredGrade) {
                System.out.println("✅ Successfully found student grade: " + enteredGrade);
                return i; // Return the index
            }
        }
        System.out.println("❌ Grade not found in our student grades.");
        return -1; // Indicate not found
    }

    // Method to get grade by index with exception handling
    public int getGradeIndex(int[] grades, int gradeIndex) {
        try {
            return grades[gradeIndex];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠️ Error: Invalid index!");
            return -1; // Return fallback
        }
    }
}
