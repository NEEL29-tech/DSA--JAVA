// !Given a string s, find if it is a palindrome. A string is considered a palindrome if it reads the same forwards and backwards.


public class ValidPalindrome {
    public static void main(String[] args) {

        String s = "abba";

        int left = 0;
        int right = s.length() - 1;

        boolean flag = true;

        while(left < right) {

            if(s.charAt(left) != s.charAt(right)) {
                flag = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(flag);
    }
}
