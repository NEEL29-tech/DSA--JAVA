// !Count Perfect Squares


public class Count_Perfect_Squares {
    public static void main(String[] args) {
        int n=10;
        System.out.println("answer:"+(int)Math.sqrt(n-1));        
    }
}


// other method use loop 
/* 
count=0
for(int i =1;i<n;i++)
{
    int sqrt = (int) Math.sqrt(i);
    if(sqrt* sqrt==i)
    count++;
}
    return count
    
*/