public class RearrangeLetters {
    public static void main(String args[]){
//        int [][]arr= {
//                {1,2,3},
//                {4,5,6}
//        };
//        int max = 0;
//        for (int i [] : arr) {
//            int sum = 0;
//            for (int j : i) {
//                sum = sum + j;
//            }
//            if (max < sum) {
//                max = sum;
//            }
//        }
//       System.out.println(max);

        //This class rearranges the letters in a string based on the indices provided in an array
        String test1 = "leetcode";
        int arr[] = {4,5,6,7,0,1,2,3};
        char[] testChar = new char[test1.length()];
        char[] testChar2 = new char[test1.length()];
        //String to array of characters
        for (int i = 0;i <test1.length();i++){
            testChar[i] =  test1.charAt(i);
        }
        //rearrange characters
        for (int i=0; i< testChar.length;i++){
            for (int j=0; j<arr.length;j++){
                testChar2[j] = testChar[arr[j]];
            }
        }
        for(int i =0;i< testChar2.length;i++) {
            System.out.print(testChar2[i]);
        }
    }
}
