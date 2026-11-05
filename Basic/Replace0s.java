// ! Replace all 0's with 5

public class Replace0s {
    public static void main(String[] args) {
        int n =1002;

        int ans =0;
        int place =1;

        if(n==0)
            ans=5;

        while(n>0)
        {
            int digit = n%10;

            if(digit==0)
                digit =5;

            ans = ans + digit*place;
            place= place*10;
            n= n/10;

        }

        System.out.println("answer:"+ans);
    }
}
