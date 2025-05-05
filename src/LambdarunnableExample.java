public class LambdarunnableExample {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Lambda Runnable is running!");
        System.out.println(runnable);
    }
}
