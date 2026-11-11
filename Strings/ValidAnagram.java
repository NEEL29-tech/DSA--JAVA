
import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        // Step 1: Check length
        if(s.length() != t.length()) {
            System.out.println("false");
            return;
        }

        // Step 2: Convert strings into character arrays
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        // Step 3: Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Step 4: Compare both arrays
        boolean flag = true;

        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                flag = false;
                break;
            }
        }

        // Step 5: Print result
        System.out.println(flag);
    }
}
