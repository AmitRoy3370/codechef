
import java.util.Scanner;

public class Prefix_Permutation {

    static Scanner in = new Scanner(System.in);

    static int n, k, testCases;

    static long a[];

    static void solve() {

        long current = 0;

        for (int i = 0; i < k; i++) {

            for (long j = a[i]; j > current; j--) {

                System.out.print(j + " ");

            }

            current = a[i];

        }

        System.out.println();

    }

    public static void main(String[] amit) {

        testCases = in.nextInt();

        for (int t = 0; t < testCases; t++) {

            n = in.nextInt();
            k = in.nextInt();

            a = new long[k];

            for (int i = 0; i < k; i++) {

                a[i] = in.nextLong();

            }

            solve();

        }

    }

}
/*

3
8 4
3 6 7 8
7 1
7
5 5
1 2 3 4 5


 */
