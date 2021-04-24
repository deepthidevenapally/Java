import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWords {
    public static void main(String args[]){
        String str = "Hello world";
        ArrayList<String> str2 = new ArrayList<>(Arrays.asList(str.split(" ")));
        ArrayList<String> revStr = new ArrayList<>();
        for(int i = str2.size()-1;i>=0;i--){
            revStr.add(str2.get(i));
        }
        for(String i : revStr) {
            System.out.println(i);
        }
    }
}
