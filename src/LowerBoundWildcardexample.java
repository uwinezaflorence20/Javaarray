import java.util.List;
import java.util.ArrayList;

public class LowerBoundWildcardexample {
   public static void addIntegerToList(List<? super Integer> list) {
       list.add(100);
       list.add(200);
   }
    public static void main(String[] args){
       List<Number> numberList = new ArrayList<>();
       addIntegerToList(numberList);
       System.out.println("Integer List: "+numberList);

       List<Number> numberList2 = new ArrayList<>();
       addIntegerToList(numberList2);
       System.out.println("Number List: "+numberList2);


        List<Object> objectList = new ArrayList<>();
        addIntegerToList(objectList);
        System.out.println("ObjectList: " +objectList);
    }
}

