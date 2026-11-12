public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "geeksforgeeks";

        boolean[] visited = new boolean[256];

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!visited[ch]) {

                ans.append(ch);

                visited[ch] = true;
            }
        }

        System.out.println(ans);
    }
}