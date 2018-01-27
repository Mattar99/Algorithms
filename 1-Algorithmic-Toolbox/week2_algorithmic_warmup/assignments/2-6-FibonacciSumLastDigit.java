import java.util.Scanner;

public class FibonacciSumLastDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(getFibonacciSumEfficient(n));
    }

    private static int getFibonacciSumEfficient(long n){

        //Sum of nth Fibonacci series = F(n+2) -1
        //Then pisano period of module 10 = let n+2 mod (60) = m then find F(m) mod(10)-1
        if (n <= 1)
            return (int)n;
        n = (n+2)%60;
        int previous = 0;
        int current  = 1;
        for (int i = 0; i < n-1 ; ++i) {
            int tmp_previous = previous%10;
            previous = current%10;
            current = (tmp_previous + current)%10;
        }
        if (current==0)
            return 9;
        else
        return current-1;

    }
}
