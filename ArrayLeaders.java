import java.util.*;

public class ArrayLeaders {

    public static void main(String[] args) {

        int arr[] = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> result = new ArrayList<>();

        int max = arr[arr.length - 1];

        result.add(max);

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] >= max) {
                result.add(arr[i]);
                max = arr[i];
            }
        }

        Collections.reverse(result);

        System.out.println("Leaders: " + result);
    }
}