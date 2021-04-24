import java.util.ArrayList;

public class TopKFreq {
    public static void main(String args[]){
        String str[] ={"1","1","1","2","2","3"};
        int count = 0;
        int k=2;
        int max=Integer.MIN_VALUE;
        ArrayList<String> arr = new ArrayList<>();

        for(int i =0;i<str.length;i++) {

            for (int j = str.length - 1; j >= 0; j--) {
                if (str[i] == str[j]) {
                    count += 1;
                }
            }
            if (max < count) {
                max = count;
                if (arr.size() <= k) {
                    arr.add(str[i]);
                }
            }

        }
        for (String i:arr) {
            System.out.println(i);
        }
        }
    }

