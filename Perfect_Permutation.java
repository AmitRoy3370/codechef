
import java.util.Scanner;

public class Perfect_Permutation {

    static Scanner in = new Scanner(System.in);

    static int n, k, testCases;

    static void solve() {

        long ans[] = new long[n];

        if (k > n) {

            System.out.println(-1);
            return;

        }

        if (k == n) {

            for (int i = 0; i < n; i++) {

                ans[i] = i + 1;

            }

            for (long i : ans) {

                System.out.print(i + " ");

            }

            System.out.println();

            return;

        }

        int i = n - 1;

        int count = n;

        int orginal = k;

        --k;

        for (i = n - 1; i >= 0 && k > 0; i--, k--) {

            ans[i] = count--;

        }

        while (i > 0) {

            ans[i--] = i + 1;

        }

        ans[0] = count;

        count = 0;

        for (i = 0; i < n; i++) {

            if (ans[i] % (i + 1) == 0) {

                count++;

            }

        }

        if (count == orginal) {

            for (long i1 : ans) {

                System.out.print(i1 + " ");

            }

            System.out.println();

            return;

        }
        System.out.println(-1);

    }

    public static void main(String[] amit) {

        testCases = in.nextInt();

        for (int t = 0; t < testCases; t++) {

            n = in.nextInt();

            k = in.nextInt();

            solve();

        }

    }

}
