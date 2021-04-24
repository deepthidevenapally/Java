import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {

    public static void sort(ArrayList<Integer> arr){
        for(int i=0;i<arr.size()-1;i++){
            for(int j=0;j<arr.size()-i-1;j++){
                if(arr.get(j)>arr.get(j+1)){
                    int temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }
            }
        }
    }


    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(30);
        arr.add(4);
        arr.add(15);
        sort(arr);
        if(Collections.binarySearch(arr,24)>0){
            System.out.println("Yes");
        }else System.out.println("No");
        System.out.println( Collections.binarySearch(arr,24));
    }

}
