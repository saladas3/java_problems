import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = in.nextInt();
        }

        boolean swapped = true;

        while (swapped){
            swapped = false;
            for (int i = 0; i < n-1; i++) {
                if (vector[i]>vector[i+1]){
                    int aux;
                    aux = vector[i+1];
                    vector[i+1] = vector[i];
                    vector [i] = aux;
                    swapped = true;
                }
            }
        }

        System.out.println(Arrays.toString(vector));
    }
}
