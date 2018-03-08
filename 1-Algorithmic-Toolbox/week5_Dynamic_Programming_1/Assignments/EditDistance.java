import java.util.*;

class EditDistance {
    public static int EditDistance(String s, String t) {
        char[] first_string = s.toCharArray();
        char[] second_string = t.toCharArray();
        int[][] results = new int[second_string.length+1][first_string.length+1];


        for (int i = 0; i <= second_string.length; i++) {

            for (int j = 0; j <= first_string.length ; j++) {

                if(i==0){
                    results[i][j]=j;
                }else if(j==0){
                    results[i][j]=i;
                }else{


                    int delta;
                    if (second_string[i-1]==first_string[j-1]) {
                        delta = 0;
                    } else
                        delta = 1;

                    results[i][j] = Math.min(Math.min(results[i][j - 1] + 1, results[i - 1][j] + 1), results[i - 1][j - 1] + delta);

                }
            }
        }
        return results[second_string.length][first_string.length];
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        String t = scan.next();

        System.out.println(EditDistance(s, t));
    }

}
