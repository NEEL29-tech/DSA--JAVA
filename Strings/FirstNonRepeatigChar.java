// ! Given a string s, find the first character that appears exactly once in the string.

public class FirstNonRepeatigChar {
    public static void main(String[] args) {
        
        String str = "geeksforgeeks";

        int[] freq = new int[256];

        // Step 1: Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        // Step 2: Find the first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] == 1) {
                System.out.println(ch);
                return;
            }
        }

        System.out.println(-1);
    }
}
