import java.util.Scanner;

public class MaxPairwiseProduct {

/*  static int dummyN;
    static int dummyM;
    static Random random = new Random();
    static int[] dummyData = new int[10];*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] Numbers = new long[n];
        long product = 0;
        for (int i = 0; i < n; i++) {
            Numbers[i] = sc.nextInt();
        }
        System.out.print(MaximumPairwiseProductFast(Numbers));




//        StressTest(10,10);
    }

    private static long MaximumPairwiseProductFast(long[] Numbers){
        int index1=0;
        for (int i = 1; i <Numbers.length ; i++) {
            if (Numbers[i]>Numbers[index1])
                index1=i;
        }
        int index2;
        if(index1==0)
            index2 = 1;
        else
            index2=0;
        for (int i = 1; i <Numbers.length ; i++) {
            if (Numbers[i]>Numbers[index2] && index1!=i) {
                index2 = i;
            }
        }

        return (Numbers[index1]*Numbers[index2]);
    }

/*    public static void StressTest(int N , int M){
        int count=0;
        while(count<300) {
        dummyN = random.nextInt(N);
        for (int i = 0; i <N ; i++) {
            dummyData[i]=random.nextInt(M);
        }
        System.out.print(Arrays.toString(dummyData));

            if (MaximumPairwiseProductFast(dummyData) == MaximumPairwiseProductNaive(dummyData)) {
                System.out.println("OK");
                count++;
            } else {
                System.out.print("Wrong answer " + MaximumPairwiseProductFast(dummyData) + " " + MaximumPairwiseProductNaive(dummyData));
                return;
            }
        }
    }*/


/*    public static int MaximumPairwiseProductNaive(int[] Numbers){
        int result=0;
        for (int i = 0; i <Numbers.length ; i++) {
            for (int j = i+1; j <Numbers.length ; j++) {
                result =Math.max(Numbers[i]*Numbers[j],result);
            }
        }
        return result;
    }*/

}
