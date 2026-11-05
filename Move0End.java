// Move All Zeroes to End


public class Move0End {
    
    
    public static void main(String[] args) {

        int arr[] = {1, 0, 2, 0, 4, 0, 5};

        int index = 0;

        // Move non-zero elements to front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zero
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

