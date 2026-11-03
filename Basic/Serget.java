/* 
Segregate Even and Odd numbers
Solved
Difficulty: BasicAccuracy: 42.11%Submissions: 47K+Points: 1
Given an array arr, write a program segregating even and odd numbers. The program should put all even numbers first in sorted order, and then odd numbers in sorted order.

Note:- You don't need to return the array, you need to modify it in-place.

Example:

Input: arr[] = [12, 34, 45, 9, 8, 90, 3]
Output: [8, 12, 34, 90, 3, 9, 45]
Explanation: Even numbers are 12, 34, 8 and 90. Rest are odd numbers.
 */

import java.util.Arrays;

public class Serget {
    public static void main(String[] args) {
        int arr[]={12, 34, 45, 9, 8, 90, 3};
        Arrays.sort(arr);
        int temp[]=new int[arr.length];
        int k =0;

        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
                temp[k++]=arr[i];
        }
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
                temp[k++]=arr[i];
        }

        for(int i =0;i<arr.length;i++)
        {
            arr[i]=temp[i];
            System.out.print(""+arr[i]+",");
        }

    }
}
