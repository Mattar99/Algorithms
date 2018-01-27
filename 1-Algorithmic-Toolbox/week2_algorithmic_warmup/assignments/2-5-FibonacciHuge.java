import java.util.*;

public class FibonacciHuge {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.print(getFibonacciHugeEfficient(n,m));
    }


    private static long calculatePisanoPeriod(long m){
        //(a+b)%m == ((a%m)+(b%m))%m
        long previousPrevious = 0 ;
        long previous = 1 ;
        long current ;
        long counter=0;
        do {
            current = (previousPrevious+previous)%m;
            previousPrevious = previous;
            previous = current;
            counter++;
        }while(!(previousPrevious==0 && previous==1));

        return counter;
    }

    private static long getFibonacciHugeEfficient(long n, long m) {
        long remainder = n % calculatePisanoPeriod(m);
        long previousPrevious = 0;
        long previous = 1;
        long current = remainder;

        for (int i = 1; i < remainder; i++) {
            current = (previousPrevious + previous) % m;
            previousPrevious = previous;
            previous = current;
        }
        return current ;
    }



}

