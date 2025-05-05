@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

public class sum {
    public static void main(String[] args) {
        MathOperation addition = (x,y) -> x+y;
        System.out.println(addition.operation(10,20));
    }
}
