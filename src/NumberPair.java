public class NumberPair<T extends Number,U extends Number> {
    private T firstNum;
    private U secondNum;

    public NumberPair(T firstNum, U secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
    public T getFirstNum() {
        return firstNum;
    }
    public void setFirstNum(T firstNum) {
        this.firstNum = firstNum;
    }

    public U getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(U secondNum) {
        this.secondNum = secondNum;
    }

    public double getSum(){
        return firstNum.doubleValue() + secondNum.doubleValue();
    }

    public double getProduct(){
        return firstNum.doubleValue() * secondNum.doubleValue();
    }

    public static void main(String[] args) {
        NumberPair<Integer,Integer> pair = new NumberPair<>(10,20);
        System.out.println("The Sum is: "+pair.getSum());
        System.out.println("The Product is: "+pair.getProduct());

        NumberPair<Double,Double> pair2 = new NumberPair<>(10.5,20.5);
        System.out.println("The Sum is: "+pair2.getSum());
        System.out.println("The Product is: "+pair2.getProduct());

        NumberPair<Float,Float> pair3 = new NumberPair<>(10.5f,20.5f);
        System.out.println("The Sum is: "+pair3.getSum());
        System.out.println("The Product is: "+pair3.getProduct());

        NumberPair<Integer,Float> pair4 = new NumberPair<>(10,20.5f);

        System.out.println("The Sum is: "+pair4.getSum());
        System.out.println("The Product is: "+pair4.getProduct());
    }

}
