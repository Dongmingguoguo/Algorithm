import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] temp = {-4,-1,0,3,10};
        List<int[]> array = new ArrayList<>();
        int arr[] = new int[temp.length];
        for (int i=0; i<temp.length; i++) {
            arr[i] = (int) Math.pow(temp[i], 2);
            array.add(arr);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
