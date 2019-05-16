public class morse {
    public static void main(String[] args) {
        String w = "zen";
        String[] part = w.split("", w.length());
        String[] str = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] aphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i=0; i<part.length; i++) {
            for (int j=0; j<aphabet.length; j++)
                if (part[i].equals(aphabet[j])) {

                    System.out.print(str[j]);
                }




        }
    }
}
