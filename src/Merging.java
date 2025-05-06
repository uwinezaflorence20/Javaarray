import java.util.Arrays;

public class Merging {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] moreNumbers = {6, 7, 8, 9, 10};
        int[] allNumbers = new int[numbers.length + moreNumbers.length];

        System.arraycopy(numbers, 0, allNumbers, 0, numbers.length);
        System.arraycopy(moreNumbers, 0, allNumbers, numbers.length, moreNumbers.length);

        System.out.println(Arrays.toString(allNumbers));
    }
}
