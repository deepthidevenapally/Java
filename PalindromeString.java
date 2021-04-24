public class PalindromeString {
    public static void main(String args[]){
        String str = "aba";
        Boolean flag = true;
        for(int i = 0,j=str.length() - 1;i<str.length();i++,j--){
                    if (str.charAt(i) == str.charAt(j)) {
                        continue;
                    } else {
                        System.out.println("Not a palindrome");
                        flag = false;
                        break;
                    }
                }

        if(flag){
            System.out.println("Palindrome");
        }
    }

}
