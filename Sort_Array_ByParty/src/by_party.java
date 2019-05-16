import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;

public class by_party {
    public static void main(String[] args) {
           int[] A = {3,1,2,4};
           Integer[] B = new Integer[A.length];

           for (int t = 0; t<A.length; ++t)
               B[t] = A[t];
           Arrays.sort(B, (a, b) -> Integer.compare(a%2, b%2));

           for (int t = 0; t<A.length; ++t)
               A[t] = B[t];

           System.out.println(Arrays.toString(A));
    }
 }
