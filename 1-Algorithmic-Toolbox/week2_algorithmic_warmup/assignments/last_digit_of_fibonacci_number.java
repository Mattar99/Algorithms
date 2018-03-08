import java.util.Random;
import java.util.Scanner;

public class Main {

    static Random random = new Random();
    static int m ;

    public static void main(String[] args) {




            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int d = getFibonacciLastDigitPerformance(n);
            System.out.println(d);


/*            while(true){
                m=random.nextInt(60);
                if(getFibonacciLastDigitNaive(m)!=getFibonacciLastDigitPerformance(m)){
                    System.out.println(m);
                    return;
                }else
                    System.out.println("OK");
            }*/




    }

    private static int getFibonacciLastDigitPerformance(int n){
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous%10;
            previous = current%10;
            current = (tmp_previous + current)%10;
        }
        return current;

    }

    private static long getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }
        return current % 10;
    }
}
