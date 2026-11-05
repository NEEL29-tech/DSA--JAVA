import java.util.Arrays;

public class ThirdLargest {
    public static void main(String[] args) {
        
        int arr[]={1,2,4,5,3};
        Arrays.sort(arr);
        int count =1;
        int largest = arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]!=largest)
            {
                count++;
                largest=arr[i];
            }
            if(count==3)
                System.out.println("3rd Largest :"+largest);
        }
        
    }
}
