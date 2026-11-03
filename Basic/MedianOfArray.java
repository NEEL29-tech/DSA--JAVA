// !Median of Array

import java.util.Arrays;

public class MedianOfArray {
    public static void main(String[] args) {
        
        int arr[]={90, 100, 78, 89, 67};
        Arrays.sort(arr);
        int n =arr.length;
        int t= arr.length/2;

        if(t==0)
        {
            int a= n/2;
            int b= (n/2)-1;

            double ans= (arr[a]+arr[b])/2.0;
            System.out.println("Median of Array:"+ans);


        }
        else
        {
            int ans = arr[n/2];
            System.out.println("median of Array:"+ans);
        }
    }
}
