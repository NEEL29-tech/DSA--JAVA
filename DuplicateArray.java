import java.util.*;

public class DuplicateArray {
    public static void main(String[] args) {

        int arr[] = {2, 3, 1, 2, 3};

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    result.add(arr[i]);
                    break;
                }
            }
        }

        Collections.sort(result);

        System.out.println(result);
    }
}