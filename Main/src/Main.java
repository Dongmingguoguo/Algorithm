import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] data = {4, 5, 3, 6, 2, 5, 1};
        List<Integer> list1 = Arrays.stream(data).boxed().collect(Collectors.toList());
        Integer[] integers1 = Arrays.stream(data).boxed().toArray(Integer[]::new);
        Integer[] integers2 = list1.toArray(new Integer[0]);
        int[] arr1 = list1.stream().mapToInt(Integer::valueOf).toArray();
        int[] arr2 = Arrays.stream(integers1).mapToInt(Integer::valueOf).toArray();

        List<Integer> list2 = Arrays.asList(integers1);
        String[] string1 = {"a", "b", "c"};
        List<String> list3 = Arrays.asList(string1);
        String[] strings2 = list3.toArray(new String[0]);


        System.out.println(Arrays.toString(strings2) + Arrays.toString(string1) + Arrays.toString(integers2));
    }
}
