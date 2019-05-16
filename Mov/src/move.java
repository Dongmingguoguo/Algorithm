import java.util.Arrays;

public class move {
    public static void main(String[] args) {
        String moves = "UD";
        String[] m = moves.split("");
        int[] t = {0,0};
        int[] original = {0,0};
        for (int i=0; i<m.length; i++) {
            if (m[i].equals("U")) {
                original[1] += 1;
            }
            if (m[i].equals("D")) {
                original[1] -= 1;
            }
            if (m[i].equals("L")) {
                original[0] -= 1;
            }
            if (m[i].equals("R")) {
                original[0] += 1;
            }

        }

        if (original[0] == 0 && original[1] ==0) {
            System.out.println("True");
        }else {
            System.out.println("False");

        }




    }
}
