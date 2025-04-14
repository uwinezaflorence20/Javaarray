import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.Collections;

public class Grade {
    int[] grades ;



    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void PrintGrade(int[] grades) {
        for (int Grades : grades) {
            System.out.println(Grades);
        }
    }

    public void SearchNumber(int[] grade, int in) {
        int searched = Arrays.binarySearch(grade, in);
        System.out.println("Result: " + searched);
    }
    public void Sort(int[] grades) {
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));
    }
    public void SortAscending(Integer[] grades) {
        Arrays.sort(grades,Collections.reverseOrder());
        System.out.println(Arrays.toString(grades));
    }
    }


