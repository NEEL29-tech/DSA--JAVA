// ! Product of Array except it self

/*
    * arr={1,2,3,4}
    * ans={24,12,8,6}
*/

public class ProductOfArray {
    public static void main(String[] args) {

        int arr[]={1,2,3,4};
        int n = arr.length;
        int ans[]=new int[n];

        ans[0]=1;
        for(int i =1;i<n;i++)
        {
            ans[i]=ans[i-1]*arr[i-1];
        }

        int suffix = 1;
        for(int i=n-1;i>=0;i--)
        {
            ans[i]=ans[i]*suffix;
            suffix=suffix*arr[i];
        }

        //answer
        for(int i =0;i<n;i++)
        {
            System.out.println(" "+ans[i]);
        }

    }
}
