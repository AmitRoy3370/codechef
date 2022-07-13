
import java.util.Scanner;

public class End_Sorted {

    static Scanner in = new Scanner(System.in);

    static StringBuilder ans = new StringBuilder();

    static int testCases, n;

    static long a[];

    static void solve(int t) {

        if (a[0] == 1 && a[n - 1] == n) {

            ans.append(0);

        } else {

            int pos1 = 0, posN = 0;

            for (int i = 0; i < n; ++i) {

                if (a[i] == 1) {

                    pos1 += i;

                } else if (a[i] == n) {

                    posN += i;

                }

            }

            int f = pos1 - 1;
            int d = n - posN;
            if (posN < pos1) {
                ans.append(f + d - 1);
            } else {
                ans.append(f + d);

            }
        }

        if (t != testCases) {

            ans.append("\n");

        }

    }

    public static void main(String[] amit) {

        testCases = in.nextInt();

        for (int t = 0; t < testCases; ++t) {

            n = in.nextInt();

            a = new long[n];

            for (int i = 0; i < n; ++i) {

                a[i] = in.nextLong();

            }

            solve(t + 1);

        }

        System.out.print(ans.toString());

    }

    static void print(long a[]) {

        for (long i : a) {

            System.out.print(i + " ");

        }

        System.out.println();

    }

}
/*

5
4
1 3 2 4
3
3 2 1
2
2 1
3
2 1 3
6
3 2 1 6 4 5

 */
