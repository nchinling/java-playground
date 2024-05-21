import java.util.ArrayList;
import java.util.List;

public class CollectionGenerics {
    
    public static void main(String[] args) {

        // List to hold strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Ling");

        for (String s: stringList) {
            System.out.println(s);
        }

        // List to hold integers
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(6);
        integerList.add(7);
        integerList.add(33);

        for (Integer i: integerList) {
            System.out.println(i);
        }

    }
}


