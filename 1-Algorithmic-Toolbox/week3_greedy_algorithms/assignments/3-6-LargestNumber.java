import java.util.*;

public class LargestNumber {
    private static String largestNumber(ArrayList<String> list) {


        StringBuilder result = new StringBuilder();

        while(!list.isEmpty()){
            String maxDigit=list.get(0);
            for (int i = 1; i <list.size(); i++) {
                if(isGreaterOrEqual(maxDigit,list.get(i))){
                    maxDigit = list.get(i);
                }
            }
            result.append(maxDigit);
            list.remove(maxDigit);
        }

        return result.toString();
    }

    private static boolean isGreaterOrEqual(String maxDigit, String digit){
        return (digit+maxDigit).compareTo(maxDigit+digit) > 0;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(scanner.next());
        }
        System.out.println(largestNumber(a));
    }
}

