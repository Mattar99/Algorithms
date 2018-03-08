import java.util.*;

public class DifferentSummands {

    private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        int rest = n ;
        for (int i = 1; i <= n ; i++) {

            if ((rest-i)<=i) {
                summands.add(rest);
                return summands;
            }
            else {
                summands.add(i);
                rest -= i;
            }

        }

        return summands;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }
}

