import java.util.Scanner;

public class ChangeDP {

    public  static final int[]  COINS = {1,3,4};

    private static int getChange(int money) {
        int[] minNumCoins = new int[money+1];
        minNumCoins[0]=0;
        int numCoins;
        for (int i = 1; i <= money ; i++) {
            minNumCoins[i]=1001;
            for (int j = 0; j < COINS.length; j++) {
                if (i >= COINS[j]) {
                    numCoins = minNumCoins[i - COINS[j]] + 1;
                    if(numCoins<minNumCoins[i])
                        minNumCoins[i]=numCoins;
                }
            }
        }
        return minNumCoins[money] ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();


        System.out.println(getChange(m));

    }
}

