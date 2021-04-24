import java.util.ArrayList;

public class Rectangles {

    public static int findMin(int arr[]){
        int min = arr[0];
        for(int i = 1; i< arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int arr[]){
        int max = arr[0];
        for(int i = 1; i< arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        ArrayList<int[]> rec = new ArrayList<>();
        int largestSq;
        rec.add(new int[]{2,3});
        rec.add(new int[]{3,7});
        rec.add(new int[]{4,3});
        rec.add(new int[]{3,7});
        int minVal[] = new int[rec.size()];
        for(int i =0;i<rec.size();i++){
           minVal[i] = findMin(rec.get(i));
        }
        largestSq = findMax(minVal);
        System.out.println(largestSq);
    }
}
