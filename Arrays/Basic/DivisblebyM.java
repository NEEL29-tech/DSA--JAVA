public  class DivisblebyM {

    public static void main(String[] args) {
        
        int m = 13, n=4;
        
        int x=n;
        int y =n;

        while(x%m!=0)
            x--;

        while (y%m!=0) {
            y++;

        }

        if(Math.abs(n-x)<Math.abs(n-y))
            System.out.println("answer:"+x);

        if(Math.abs(n-x)>Math.abs(n-y))
            System.out.println("answer:"+y);

        if(Math.abs(x)>Math.abs(y))
        {
            System.out.println("answer"+x);
        }
        else
        {
            System.out.println("Answer:"+y);
        }
    }
}