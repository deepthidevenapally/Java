public class SumofDiagonal {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        int psum = 0;
        int ssum =0;
        for (int i = 0; i < arr.length; i++){
            for(int j = 0;j<arr[i].length;j++){
                if(i==j) {
                    psum = psum + arr[i][j];
                }
                else if(i+j==arr[i].length-1){
                    ssum+=arr[i][j];
                }
            }
        }
        System.out.println(psum+ssum);
    }
}
