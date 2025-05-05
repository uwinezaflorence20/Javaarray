public class BoxQuiz<T> {
private T object;

    public BoxQuiz(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
    public static void main(String[] args) {
        BoxQuiz<Integer> box = new BoxQuiz<>(10);
        System.out.println(box.getObject());
    }
}
