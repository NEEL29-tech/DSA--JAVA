// !Given an array arr[] that contains positive and negative integers (may contain 0 as well). 
// !Find the maximum product that we can get in a subarray of arr[].

public class MaxProductSubArray {
    public static void main(String[] args) {
        int arr[]={-9,-2,0};

        int maxP=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            int CP= 1;
            for(int j =i;j<arr.length;j++)
            {
                CP*=arr[j];
                maxP=Math.max(maxP, CP);
            }
        }

        System.out.println(("MAXIMUM PRODUCT SUB ARRAY : ")+maxP);
    }
}
