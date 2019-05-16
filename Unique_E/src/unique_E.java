import java.util.HashSet;

public class unique_E {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};

        HashSet<String> hs = new HashSet<>();

        for (int i=0; i<emails.length; i++){
            String[] splitEmail = emails[i].split("@");
            String email = (splitEmail[0].indexOf("+") == -1 ?
                    splitEmail[0]:splitEmail[0].substring(0,splitEmail[0].indexOf("+"))).replace(".", "")
                    + "@"+splitEmail[1];
            hs.add(email);
        }
        System.out.println(hs.size());
    }
}
