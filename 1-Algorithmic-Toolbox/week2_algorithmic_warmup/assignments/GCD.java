import java.util.Random;
import java.util.Scanner;

public class Main {

/*    private static Random random = new Random();
    private static int A ;private static int B ;*/

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        System.out.println(gcd_efficient(a, b));


/*        while(true){
            A = random.nextInt(1000);
            B = random.nextInt(1000);
            if(gcd_naive(A,B)!=gcd_efficient(A,B)){
                System.out.println(A+" "+B);
                return;
            }
            else System.out.println("OK");

        }*/
    }



    private static int gcd_naive(int a, int b) {
        int current_gcd = 1;
        for(int d = 2; d <= a && d <= b; ++d) {
            if (a % d == 0 && b % d == 0) {
                if (d > current_gcd) {
                    current_gcd = d;
                }
            }
        }

        return current_gcd;
    }
	//The Euclidean Algorithm
    private static int gcd_efficient(int a, int b){
        if(a==0)
            return b;
        if(b==0)
            return a;
        else return gcd_efficient(b,a%b);

    }
}
