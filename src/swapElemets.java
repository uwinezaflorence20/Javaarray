import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class swapElements<T>{

    public void swap(List<T> list,int index1,int index2){

        Collections.swap(list,index1,index2);




    }

    public static void main(String[] args) {
        {

            swapElements<String> swapArray = new swapElements<>();

            List<String> names = Arrays.asList("milli", "Florence", "anne", "sando");
            System.out.println("Before swapping:");
            System.out.println(names);
            System.out.println("after swapping:");
            swapArray.swap(names, 0, 3);
            System.out.println(names);

        }

    }}