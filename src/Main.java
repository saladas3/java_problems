import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nr_of_pairs;
        Scanner in = new Scanner(System.in);

        nr_of_pairs = in.nextInt();

        int[] all_the_prime_pairs = new int[2 * nr_of_pairs];

        for (int i = 0; i < all_the_prime_pairs.length; i++) {
            all_the_prime_pairs[i] = in.nextInt();
        }

        for (int i = 0; i < all_the_prime_pairs.length - 1; i += 2) {
            int nr_of_primes_between_pairs = 0;

            for (int j = all_the_prime_pairs[i]; j <= all_the_prime_pairs[i + 1]; j++) {
                int is_prime = 1;

                for (int d = 2; d <= j / 2; d++) {
                    if (j % d == 0) {
                        is_prime = 0;
                        break;
                    }
                }

                if (is_prime == 1) {
                    nr_of_primes_between_pairs++;
                }
            }
            System.out.print(nr_of_primes_between_pairs + " ");
        }
    }
}
