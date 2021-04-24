import java.util.HashSet;
import java.util.Set;

public class PatternPresent {

    public static void main(String args[]) {
        String allowed = "abc";
        String words [] = {"a","b","c","ab","ac","bc","abc"};
//        char charsOfwords [] = allowed.toCharArray();

//        Set<Character> setCharsOfAllowed = new HashSet<>();
//        for(int i = 0; i<charsOfAllowed.length; i++){
//            setCharsOfAllowed.add(charsOfAllowed[i]);
//        }

       int count = 0;
        for(int i = 0; i<words.length; i++){
            boolean present = true;
            for (char ch : words[i].toCharArray()) {
                if (!allowed.contains(String.valueOf(ch))) {
                    present = false;
                }
            }
                if (present){
                    count++;

            }
        }


        System.out.print(count);
    }
}
