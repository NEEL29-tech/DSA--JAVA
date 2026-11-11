// ! Factorial of Number 



import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int ans = 1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter N:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            ans = ans*i;
        }
        System.out.println("Answer of Factorial :"+ans);
        sc.close();
    }
}