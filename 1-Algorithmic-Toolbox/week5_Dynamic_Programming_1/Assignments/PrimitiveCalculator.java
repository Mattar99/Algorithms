import java.util.*;

public class PrimitiveCalculator {

    private static List<Integer> optimal_sequence(int n) {
        //96234
        List<Integer> sequence = new ArrayList<Integer>();

        int[] bottom_up_dp = new int[n+1];
        int[] path = new int[n+1];

        bottom_up_dp[1]=0; // trivial case;

        for (int i = 2; i <= n ; i++) {

            bottom_up_dp[i]=1+bottom_up_dp[i-1];  // +1 case
            path[i]=i-1;

            if(i%3==0) {                          // *3 case
                if(bottom_up_dp[i/3]<bottom_up_dp[i]){
                    bottom_up_dp[i] = 1 + bottom_up_dp[i/3];
                    path[i]=i/3;
                }
            }

            if(i%2==0) {                          // *2 case
                if(bottom_up_dp[i/2]<bottom_up_dp[i]){
                    bottom_up_dp[i]=1+bottom_up_dp[i/2];
                    path[i]=i/2;
                }
            }
        }

        for (int i = 0; i <path.length ; i++) {
            System.out.print(path[i]+" ");
        }

        for (int i = n; i !=0 ; i=path[i]) {
            sequence.add(i);
        }


        Collections.reverse(sequence);
        return sequence;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = optimal_sequence(n);

        System.out.println(sequence.size() - 1);

        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
    }
}

