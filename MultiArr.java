import java.util.ArrayList;
import java.util.List;

public class MultiArr {
    public static void main(String args[]){
        //Multi Dim Arrays
        int[][] multiArr = {{1,2},{2,3}};
        //Multi Dim Lists
        ArrayList<ArrayList<Integer>> outArr = new ArrayList<>(5);
//        ArrayList<Integer> innerArr = new ArrayList<>();
//        innerArr.add(1);
//        outArr.add(innerArr);

        //Traversal
        // Array
        for(int i =0;i<multiArr.length;i++){
            for(int j=0;j<multiArr[i].length;j++){
              multiArr[i][j] = 0;
            }
        }
        // ArrayList
        for(int i=0;i<outArr.size();i++){
            ArrayList<Integer> innerArr = new ArrayList<>(5);
            for(int j=0;j<innerArr.size();j++){
                innerArr.add(3);
            }
            outArr.add(innerArr);
        }

    }
}
