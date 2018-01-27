import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(lcm_effiecent(a, b));

    }

	// lcm(a,b) = |a.b| / gcd(a,b)

    private static long lcm_effiecent(int a , int b){
        if(a==0 && b==0){
            return 0;
        }else{
            return ((a/gcd_efficient(a,b))*b);
        }
    }

    private static long gcd_efficient(int a, int b){
        if(a==0)
            return b;
        if(b==0)
            return a;
        else return gcd_efficient(b,a%b);

    }

/*    private static long lcm_naive(int a, int b) {

        for (long l = 1; l <= (long) a * b; ++l)
            if (l % a == 0 && l % b == 0)
                return l;

        return (long) a * b;
    }*/
}
