import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfItems = sc.nextInt();
        int Capacity = sc.nextInt();
        double[] values = new double[numberOfItems];
        int[] Weights = new int[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            values[i] = sc.nextInt();
            Weights[i] = sc.nextInt();
        }
        System.out.println((Math.round(OptimalValue(Capacity,values,Weights,numberOfItems)*10000d))/10000d);


    }

    private static int SelectMaxUnitValue(double[] values, int[] weights, int n) {
        int index = -1;
        double max = 0;
        for (int i = 0; i < n; i++) {
            if ( weights[i] > 0 && (values[i] / weights[i] > max)) {
                max = values[i] / weights[i];
                index = i;
            }
        }

        return index;
    }

    private static double OptimalValue(int capacity, double[] values, int[] weights, int n) {

        if (capacity == 0)
            return 0;
        double value = 0;
        int Maxindex;
        double AvailableWeights;
        for (int i = 0; i < n; i++) {
            Maxindex = SelectMaxUnitValue(values,weights,n);
            if(Maxindex>=0) {
                AvailableWeights = Math.min(capacity, weights[Maxindex]);
                value += AvailableWeights * (values[Maxindex] / weights[Maxindex]);
                weights[Maxindex] -= AvailableWeights;
                capacity          -=AvailableWeights;
            }
        }
        return value;
    }
}
