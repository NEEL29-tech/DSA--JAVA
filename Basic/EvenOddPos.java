/*
    Given an array of car numbers car[], an array of penalties fine[], and an integer date, find the total fine collected on that date. The fine is collected based on parity, i.e., on an even date, fines are collected from odd-numbered cars, and on an odd date, fines are collected from even-numbered cars.

Examples:

Input: date = 12, car[] = [2375, 7682, 2325, 2352], fine[] = [250, 500, 350, 200]
Output: 600
Explanation: The date is 12 (even), so we collect the fine from odd-numbered cars. The odd-numbered cars and the fines associated with them are as follows:
2375 -> 250
2325 -> 350
The sum of the fines is 250+350 = 600
*/

public class EvenOddPos {
    public static void main(String[] args) {
        int date = 12, car[] = {2375, 7682, 2325, 2352}, fine[] = {250, 500, 350, 200};
        long sum =0;
        for(int i =0;i<car.length;i++)
        {
            if(date%2==0)
            {
                if(car[i]%2!=0)
                    sum+= fine[i];
            }
            else
            {
                if(car[i]%2==0)
                    sum+=fine[i];
            }
        }
        System.out.println("total Fined is :"+sum);
    }
}
