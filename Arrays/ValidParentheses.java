
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        String s = "{{[[()]]}}";

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Opening brackets
            if(ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            }

            // Closing brackets
            else {
                if(st.empty()) {
                    System.out.println("false");
                    return;
                }

                char top = st.pop();

                if(ch == '}' && top != '{') {
                    System.out.println("false");
                    return;
                }

                if(ch == ']' && top != '[') {
                    System.out.println("false");
                    return;
                }

                if(ch == ')' && top != '(') {
                    System.out.println("false");
                    return;
                }
            }
        }

        // Final check
        if(st.isEmpty()) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
