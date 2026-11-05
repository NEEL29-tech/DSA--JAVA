// !Triplet Sum in Array

/*
 * Given an array arr[] and an integer target, determine if there exists a triplet in the array whose sum equals the given target.
*/
public class TripletSum {
    public static void main(String[] args) {
        int arr[]={1, 4, 45, 6, 10, 8};
        int target = 13;
        boolean found=false;
        for(int i=0;i<arr.length-2;i++)
        {
            int left = i+1;
            int right=arr.length-1;

            while (left<right) {
                int sum = arr[i]+arr[left]+arr[right];

                if(sum==target)
                {   found = true;
                    break;
                }
                else if(sum<target)
                    left++;
                else
                    right--;
            }

            if(found)
            {
                break;
            }


        }

        System.out.println("Triplet Is Found");
    }
}
