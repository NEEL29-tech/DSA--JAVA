public class CheckPower {
    public static void main(String[] args) {

        int x = 2, y = 8;

        int ans = 1;

        while (ans < y) {
            ans = ans * x;
        }

        if (ans == y) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}