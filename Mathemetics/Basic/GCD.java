// !Find GCD of Two Numbers 

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter A:");
        int a = sc.nextInt();

        System.out.println("Enter B:");
        int b = sc.nextInt();

        while(b!=0)
        {
            int temp = b;
            b= a%b;
            a = temp;
        }
        
        System.out.println("Answer of GCD:"+a);
        sc.close();
    }
}


/* 
    * 
    if a= 3 ; b=6
    1st temp=6;
    b= 3%6 = 3
    a = temp = 6

    2nd a = 6, b=3
    temp = 3
    b=3
    a = 3

    3rd a=3 , b=3
    temp=3
    b = 0
    a = 3

    4th b=0 loop end 
*/ 