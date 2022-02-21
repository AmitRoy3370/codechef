
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PerMEXuation {

    static Scanner in = new Scanner(System.in);

    static int testCases, n;

    static char a[];

    static void solve() {

        if (a[0] - '0' == 0 || a[1] - '0' == 0 || a[n] - '0' == 0) {

            System.out.println("NO");

            return;

        }

        StringBuilder ans = new StringBuilder();

        Queue<Long> queue = new LinkedList<>();

        queue.add((long) 0);

        int index = 0;

        for (long i : a) {

            if (index == 0) {

                ++index;

                continue;

            }

            if ((i - '0') == 1) {

                if (queue.isEmpty()) {

                    System.out.println("NO");

                    return;

                }

                ans.append(queue.poll()).append(" ");

                queue.add((long) index);

            } else {

                ans.append((long) index).append(" ");

            }

            ++index;

        }

        System.out.println("YES");

        System.out.println(ans);

    }

    public static void main(String[] amit) {

        testCases = in.nextInt();

        for (int t = 0; t < testCases; t++) {

            n = in.nextInt();

            a = in.next().toCharArray();

            solve();

        }

    }

}
/*

4
2
111
5
110100
5
110101
7
11100111


 */

 /*

1
5
110100

 */
