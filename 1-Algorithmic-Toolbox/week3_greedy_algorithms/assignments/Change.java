import java.util.Scanner;

public class Change {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int Money = sc.nextInt();

          System.out.println(ChangeNumber(Money));

    }


    private static int ChangeNumber(int Money ){

        double N = 0;
        int remainder = Money;

        if(remainder%10==0) {
            N += remainder / 10;
            return(int)N;
        }else{
            N+=Math.floor(remainder/10);
            remainder = remainder%10;
        }
        if(remainder%5==0) {
            N += remainder / 5;
            return(int)N;
        }else{
            N+=Math.floor(remainder/5);
            remainder = remainder%5;
        }
        N+=remainder;
        return(int)N;
    }
	
	
	/*
	def get_change(m):
    amount_of_ten = int(m / 10)
    amount_of_five = int((m - amount_of_ten * 10) / 5)
    amount_of_one = int(m - amount_of_ten * 10 - amount_of_five * 5)
    return amount_of_ten + amount_of_five + amount_of_one
	*/
}
