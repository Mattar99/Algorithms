import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfSlots = sc.nextInt();
        int[]As = new int[numberOfSlots];
        int[]Bs = new int[numberOfSlots];
        for (int i = 0; i <numberOfSlots ; i++) {
            As[i]=        sc.nextInt();
        }
        for (int i = 0; i <numberOfSlots ; i++) {
            Bs[i]=        sc.nextInt();
        }
        Arrays.sort(As);
        Arrays.sort(Bs);
        System.out.println(maxValue(numberOfSlots,As,Bs));
    }



    private static long maxValue(int n,int[] A, int[] B){

        long value = 0 ;

        for (int i = 0; i <n ; i++) {
            value += (long)A[i]*B[i];
        }

        return value;
    }





}
