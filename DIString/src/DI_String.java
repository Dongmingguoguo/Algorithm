import java.util.Arrays;

public class DI_String {
    public static void main(String[] args) {
        String S = "IDID";
        System.out.println(S.length());

        if(S.charAt(S.length() - 1) == 'D')
            S += 'I';
        else
            S += 'D';
        System.out.println(S+='I');

        int answer[] = new int[S.length()];
        int increase = 0, decrease = S.length() - 1;

        for(int i = 0; i < answer.length; i++)
        {
            if(S.charAt(i) == 'I')
                answer[i] = increase++;
            else
                answer[i] = decrease--;
            System.out.println(Arrays.toString(answer));
        }


    }
    }

