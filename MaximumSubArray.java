// !Given an integer array nums, find the subarray with the largest sum, and return its sum.

public class MaximumSubArray {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,-5,1,4};
        int currentsum=arr[0];
        int maxsum= arr[0];

        for(int i=1;i<arr.length;i++)
        {
            currentsum=Math.max(arr[i], currentsum+arr[i]);
            maxsum=Math.max(maxsum, currentsum);
        }
        System.out.println("Maximum Subarray Sum:"+maxsum);
    }
}
