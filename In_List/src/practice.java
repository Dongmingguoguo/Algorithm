import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class practice {
    public static void main(String[] args) {

        List<List<Integer>> Array = new ArrayList<List<Integer>>();
        for (int i=0; i<5; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j=0; j<5; j++){
                list.add(j);
            }
            Array.add(list);
        }
        for (List<Integer>subList : Array) {
            System.out.println(subList );
        }


    }
}
