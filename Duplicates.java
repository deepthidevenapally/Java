import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Duplicates {
    public static void main(String args[]){
        String str = "Deepthidygiiii";
//        Using arraylist
        ArrayList<Character> dup = new ArrayList<>();
//        Using hashmap with count
        HashMap<Character,Integer> hashMap = new HashMap<>();

        for(int i = 0; i< str.length();i++){

            for(int j = i+1; j< str.length()-1;j++) {
                if (str.charAt(i) == str.charAt(j)) {

                    if (!dup.contains(str.charAt(i))) {
                        dup.add(str.charAt(i));
                    }
                    //if element already exists, increment the value, if key doesn't exists, append "1" as value(occurance)
                    hashMap.put(str.charAt(i),hashMap.containsKey(str.charAt(i))?hashMap.get(str.charAt(i))+1:1);
                }
            }

        }
//        arraylist iteration
        for(char i : dup){
        System.out.println(i);
        }
//        hashmap iteration
        for(Map.Entry<Character, Integer> map : hashMap.entrySet()){
            System.out.println(map.getKey() +" "+ map.getValue());
        }
    }


}
