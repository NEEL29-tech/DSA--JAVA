
// !Given an array arr[] of integers and a number x, find the sum of subarray having a maximum sum less than or equal to the given value of x.
public class MaxSubArray {

    public static void main(String[] args) {

        int arr[] = {4, 2, -1, 3};
        int x = 5;

        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int currentsum = 0;

            for (int j = i; j < arr.length; j++) {

                currentsum += arr[j];

                if (currentsum <= x) {
                    maxsum = Math.max(maxsum, currentsum);
                }
            }
        }

        System.out.println("Maximum Subarray Sum: " +
            (maxsum == Integer.MIN_VALUE ? 0 : maxsum));
    }
}
