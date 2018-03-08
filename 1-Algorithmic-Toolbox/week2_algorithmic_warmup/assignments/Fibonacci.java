import java.util.Random;
import java.util.Scanner;

public class Fibonacci {

    static Random random = new Random();
    static int number;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(calc_fib_efficient(n));


/*        while(true){
            number = random.nextInt(15);
            if(calc_fib(number)!=calc_fib_efficient(number)) {
                System.out.println(calc_fib_efficient(number) + " " + calc_fib(number) + " " + number);
                break;
            }
            else
                System.out.println("OK");
        }*/

    }
    private static long calc_fib(int n) {
        if (n <= 1)
            return n;

        return calc_fib(n - 1) + calc_fib(n - 2);
    }

    private static long calc_fib_efficient(int n){
        long[] series = new long[n+1];
        if(n<=0)
            return 0;
        series[0]=0;
        series[1]=1;
        for (int i = 2; i <=n ; i++) {
            series[i]=series[i-1]+series[i-2];
        }
        return series[n];
    }
}
