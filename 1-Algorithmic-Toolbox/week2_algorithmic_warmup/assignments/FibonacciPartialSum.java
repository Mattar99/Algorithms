import java.util.Scanner;

public class FibonacciPartialSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();

        System.out.println(getFibonacciPartialSumEfficient(m,n));
    }


    private static int getFibonacciPartialSumEfficient(long m,long n){
        if (n <= 1)
            return (int)n;


        m = m%60;
        n=  n%60;
        int sum;
        int previous = 0;
        int current  = 1;


        for (int i = 0; i < m-1 ; ++i) {
            int tmp_previous = previous%10;
            previous = current%10;
            current = (tmp_previous + current)%10;
        }

        sum = current;

        int j;
        if(m!=0)j=0;else j=1;

        for ( int i=j ; i < n-m ; ++i) {
            int tmp_previous = previous%10;
            previous = current%10;
            current = (tmp_previous + current)%10;
            sum+=current%10;
        }

        return sum%10;
    }


}
